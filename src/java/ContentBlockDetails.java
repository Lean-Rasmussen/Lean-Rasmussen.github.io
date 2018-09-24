package telmore.element.content;

import telmore.HtmlPicker;
import telmore.element.TelmoreElement;
import telmore.element.TelmoreTemplate;
import telmore.util.IdBeautifier;
import wcs.api.Asset;
import wcs.api.Env;
import wcs.api.Index;
import wcs.api.Log;
import wcs.java.AssetSetup;
import wcs.java.Template;

import static wcs.Api.getLog;
import static wcs.Api.ifn;

@Index("telmore/elements.txt")
public class ContentBlockDetail extends TelmoreElement {
    final static Log log = getLog(ContentBlockDetail.class);
    public static AssetSetup setup() {

        AssetSetup detail = new TelmoreTemplate("Telmore_Content", "ContentBlockDetail",
                Template.INTERNAL, // change template type here
                "Telmore_ContentBlock", telmore.element.content.ContentBlockDetail.class) //
                .cache("true,~0", "true,~0")
                .description("Template Telmore_ContentBlockDetail for type Telmore_ContentBlock");

        AssetSetup layout = new TelmoreTemplate("Telmore_Content", "ContentBlockDetail",
                Template.LAYOUT, // change template type here
                "Telmore_ContentBlock", telmore.element.content.ContentBlockDetail.class) //
                .cache("true,~0", "true,~0")
                .description("Template Telmore_ContentBlockDetail Layout for type Telmore_ContentBlock");
        detail.setNextSetup(layout);

        return detail;


    }

    @Override
    public String doApply(Env e) {
        HtmlPicker html = HtmlPicker.load("/content/content_block_detail.html" , "#content");
        Asset a = e.getAsset();
        html.attr("[href]","href","#panelbody-collapse-"+ IdBeautifier.getId(a));
        html.attr("#panelbody-collapse", "id","panelbody-collapse-"+IdBeautifier.getId(a));
        if(!ifn(a.getString("Title"),"").equals("")){
            html.append(".panel-title", a.editString("Title"));
        }else{
            html.remove(".panel-heading");
        }

        boolean closedOnLoadIsSelected = a.editString("ClosedOnLoad") != null;
        if (closedOnLoadIsSelected) {
            html.removeClass("div.panel-collapse.collapse","in");
            html.addClass("div.panel-heading", "collapsed");
        }
        //this is the template to make the content react on Hide and show is selected
        boolean closedOnLoadIsSelected = a.editString("ClosedOnLoad") != null;
        if (closedOnLoadIsSelected) {
            html.removeClass("div.panel-collapse.collapse","in");
            html.addClass("div.panel-heading", "collapsed");
        }

        html.replace(".panel-body", a.editText("Body",null));

        return html.html();
    }
}
