package telmore.model.definition;

import telmore.model.annotation.*;
import telmore.model.enums.EditorTypeNames;
import wcs.api.Index;
import wcs.java.model.type.TString;
import wcs.java.model.type.TText;
import wcs.java.model.type.WCSAttribute;

/**
 * Created by davidhenriksen on 12/11/14.
 * revised by LeanRasmussen on 20/09/18
 */
@AssetDefinition("Content Block")
@ParentLink(value = ParentContent.class, multiple = true)
@Index("telmore/definitions.txt")
public class ContentBlock implements WCSDefinition {

    @AssetAttribute("Title")
    private WCSAttribute<TString> title;

    @AssetAttribute("Body")
    @Required
    @Editor(EditorTypeNames.RICH_TEXT_EDITOR)
    private WCSAttribute<TText> body;

    @AssetAttribute("Closed on load")
    @Editor(EditorTypeNames.YES_NO_OPTION)
    @Multiple
    private WCSAttribute<TString> closedOnLoad;

//above is standard
    // yes no button if there should be the feature
    @AssetAttribute("Hide Show text")
    @Editor(EditorTypeNames.YES_NO_OPTION)
    @Multiple
    private WCSAttribute<TString> hideShowText;
    // color of Btn if btn should not be predefined.
    @AssetAttribute("Background Color")
    @Editor(EditorTypeNames.COLOR_PULLDOWN)
    private WCSAttribute<TString> bgColor;
    // size of Btnmif it should not be standard
    @AssetAttribute("Size")
    @Editor(EditorTypeNames.CONTENT_SIZE_PULLDOWN)
    private WCSAttribute<TString> contentSize;
    //Tracking-ID if you want to track
    @AssetAttribute("Tracking-Id (icid)")
    private WCSAttribute<TString> trackingId;
}
