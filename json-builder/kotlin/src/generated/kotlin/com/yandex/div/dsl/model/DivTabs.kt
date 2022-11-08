// Generated code. Do not modify.

package com.yandex.div.dsl.model

import java.net.URI
import com.fasterxml.jackson.annotation.*
import com.yandex.div.dsl.*
import com.yandex.div.dsl.context.*
import com.yandex.div.dsl.type.*
import com.yandex.div.dsl.util.*

class DivTabs internal constructor(
    @JsonIgnore override val accessibility: Property<DivAccessibility>?,
    @JsonIgnore override val alignmentHorizontal: Property<DivAlignmentHorizontal>?,
    @JsonIgnore override val alignmentVertical: Property<DivAlignmentVertical>?,
    @JsonIgnore override val alpha: Property<Double>?,
    @JsonIgnore override val background: Property<List<DivBackground>>?,
    @JsonIgnore override val border: Property<DivBorder>?,
    @JsonIgnore override val columnSpan: Property<Int>?,
    @JsonIgnore val dynamicHeight: Property<BoolInt>?,
    @JsonIgnore override val extensions: Property<List<DivExtension>>?,
    @JsonIgnore override val focus: Property<DivFocus>?,
    @JsonIgnore val hasSeparator: Property<BoolInt>?,
    @JsonIgnore override val height: Property<DivSize>?,
    @JsonIgnore override val id: Property<String>?,
    @JsonIgnore val items: Property<List<Item>>?,
    @JsonIgnore override val margins: Property<DivEdgeInsets>?,
    @JsonIgnore override val paddings: Property<DivEdgeInsets>?,
    @JsonIgnore val restrictParentScroll: Property<BoolInt>?,
    @JsonIgnore override val rowSpan: Property<Int>?,
    @JsonIgnore override val selectedActions: Property<List<DivAction>>?,
    @JsonIgnore val selectedTab: Property<Int>?,
    @JsonIgnore val separatorColor: Property<Color>?,
    @JsonIgnore val separatorPaddings: Property<DivEdgeInsets>?,
    @JsonIgnore val switchTabsByContentSwipeEnabled: Property<BoolInt>?,
    @JsonIgnore val tabTitleStyle: Property<TabTitleStyle>?,
    @JsonIgnore val titlePaddings: Property<DivEdgeInsets>?,
    @JsonIgnore override val tooltips: Property<List<DivTooltip>>?,
    @JsonIgnore override val transform: Property<DivTransform>?,
    @JsonIgnore override val transitionChange: Property<DivChangeTransition>?,
    @JsonIgnore override val transitionIn: Property<DivAppearanceTransition>?,
    @JsonIgnore override val transitionOut: Property<DivAppearanceTransition>?,
    @JsonIgnore override val transitionTriggers: Property<List<DivTransitionTrigger>>?,
    @JsonIgnore override val visibility: Property<DivVisibility>?,
    @JsonIgnore override val visibilityAction: Property<DivVisibilityAction>?,
    @JsonIgnore override val visibilityActions: Property<List<DivVisibilityAction>>?,
    @JsonIgnore override val width: Property<DivSize>?,
) : Div, DivBase {

    @JsonProperty("type") override val type = "tabs"

    @JsonAnyGetter
    internal fun properties(): Map<String, Any> {
        return propertyMapOf(
            "accessibility" to accessibility,
            "alignment_horizontal" to alignmentHorizontal,
            "alignment_vertical" to alignmentVertical,
            "alpha" to alpha,
            "background" to background,
            "border" to border,
            "column_span" to columnSpan,
            "dynamic_height" to dynamicHeight,
            "extensions" to extensions,
            "focus" to focus,
            "has_separator" to hasSeparator,
            "height" to height,
            "id" to id,
            "items" to items,
            "margins" to margins,
            "paddings" to paddings,
            "restrict_parent_scroll" to restrictParentScroll,
            "row_span" to rowSpan,
            "selected_actions" to selectedActions,
            "selected_tab" to selectedTab,
            "separator_color" to separatorColor,
            "separator_paddings" to separatorPaddings,
            "switch_tabs_by_content_swipe_enabled" to switchTabsByContentSwipeEnabled,
            "tab_title_style" to tabTitleStyle,
            "title_paddings" to titlePaddings,
            "tooltips" to tooltips,
            "transform" to transform,
            "transition_change" to transitionChange,
            "transition_in" to transitionIn,
            "transition_out" to transitionOut,
            "transition_triggers" to transitionTriggers,
            "visibility" to visibility,
            "visibility_action" to visibilityAction,
            "visibility_actions" to visibilityActions,
            "width" to width,
        )
    }

    class Item internal constructor(
        @JsonIgnore val div: Property<Div>?,
        @JsonIgnore val title: Property<String>?,
        @JsonIgnore val titleClickAction: Property<DivAction>?,
    ) {

        @JsonAnyGetter
        internal fun properties(): Map<String, Any> {
            return propertyMapOf(
                "div" to div,
                "title" to title,
                "title_click_action" to titleClickAction,
            )
        }
    }

    class TabTitleStyle internal constructor(
        @JsonIgnore val activeBackgroundColor: Property<Color>?,
        @JsonIgnore val activeFontWeight: Property<DivFontWeight>?,
        @JsonIgnore val activeTextColor: Property<Color>?,
        @JsonIgnore val animationDuration: Property<Int>?,
        @JsonIgnore val animationType: Property<AnimationType>?,
        @JsonIgnore val cornerRadius: Property<Int>?,
        @JsonIgnore val cornersRadius: Property<DivCornersRadius>?,
        @JsonIgnore val fontFamily: Property<DivFontFamily>?,
        @JsonIgnore val fontSize: Property<Int>?,
        @JsonIgnore val fontSizeUnit: Property<DivSizeUnit>?,
        @JsonIgnore val fontWeight: Property<DivFontWeight>?,
        @JsonIgnore val inactiveBackgroundColor: Property<Color>?,
        @JsonIgnore val inactiveFontWeight: Property<DivFontWeight>?,
        @JsonIgnore val inactiveTextColor: Property<Color>?,
        @JsonIgnore val itemSpacing: Property<Int>?,
        @JsonIgnore val letterSpacing: Property<Double>?,
        @JsonIgnore val lineHeight: Property<Int>?,
        @JsonIgnore val paddings: Property<DivEdgeInsets>?,
    ) {

        @JsonAnyGetter
        internal fun properties(): Map<String, Any> {
            return propertyMapOf(
                "active_background_color" to activeBackgroundColor,
                "active_font_weight" to activeFontWeight,
                "active_text_color" to activeTextColor,
                "animation_duration" to animationDuration,
                "animation_type" to animationType,
                "corner_radius" to cornerRadius,
                "corners_radius" to cornersRadius,
                "font_family" to fontFamily,
                "font_size" to fontSize,
                "font_size_unit" to fontSizeUnit,
                "font_weight" to fontWeight,
                "inactive_background_color" to inactiveBackgroundColor,
                "inactive_font_weight" to inactiveFontWeight,
                "inactive_text_color" to inactiveTextColor,
                "item_spacing" to itemSpacing,
                "letter_spacing" to letterSpacing,
                "line_height" to lineHeight,
                "paddings" to paddings,
            )
        }

        enum class AnimationType(@JsonValue val value: String) {
            SLIDE("slide"),
            FADE("fade"),
            NONE("none"),
        }
    }
}

fun <T> TemplateContext<T>.divTabs(): LiteralProperty<DivTabs> {
    return value(DivTabs(
        accessibility = null,
        alignmentHorizontal = null,
        alignmentVertical = null,
        alpha = null,
        background = null,
        border = null,
        columnSpan = null,
        dynamicHeight = null,
        extensions = null,
        focus = null,
        hasSeparator = null,
        height = null,
        id = null,
        items = null,
        margins = null,
        paddings = null,
        restrictParentScroll = null,
        rowSpan = null,
        selectedActions = null,
        selectedTab = null,
        separatorColor = null,
        separatorPaddings = null,
        switchTabsByContentSwipeEnabled = null,
        tabTitleStyle = null,
        titlePaddings = null,
        tooltips = null,
        transform = null,
        transitionChange = null,
        transitionIn = null,
        transitionOut = null,
        transitionTriggers = null,
        visibility = null,
        visibilityAction = null,
        visibilityActions = null,
        width = null,
    ))
}

fun <T> TemplateContext<T>.divTabs(
    items: Property<List<DivTabs.Item>>? = null,
    accessibility: Property<DivAccessibility>? = null,
    alignmentHorizontal: Property<DivAlignmentHorizontal>? = null,
    alignmentVertical: Property<DivAlignmentVertical>? = null,
    alpha: Property<Double>? = null,
    background: Property<List<DivBackground>>? = null,
    border: Property<DivBorder>? = null,
    columnSpan: Property<Int>? = null,
    dynamicHeight: Property<BoolInt>? = null,
    extensions: Property<List<DivExtension>>? = null,
    focus: Property<DivFocus>? = null,
    hasSeparator: Property<BoolInt>? = null,
    height: Property<DivSize>? = null,
    id: Property<String>? = null,
    margins: Property<DivEdgeInsets>? = null,
    paddings: Property<DivEdgeInsets>? = null,
    restrictParentScroll: Property<BoolInt>? = null,
    rowSpan: Property<Int>? = null,
    selectedActions: Property<List<DivAction>>? = null,
    selectedTab: Property<Int>? = null,
    separatorColor: Property<Color>? = null,
    separatorPaddings: Property<DivEdgeInsets>? = null,
    switchTabsByContentSwipeEnabled: Property<BoolInt>? = null,
    tabTitleStyle: Property<DivTabs.TabTitleStyle>? = null,
    titlePaddings: Property<DivEdgeInsets>? = null,
    tooltips: Property<List<DivTooltip>>? = null,
    transform: Property<DivTransform>? = null,
    transitionChange: Property<DivChangeTransition>? = null,
    transitionIn: Property<DivAppearanceTransition>? = null,
    transitionOut: Property<DivAppearanceTransition>? = null,
    transitionTriggers: Property<List<DivTransitionTrigger>>? = null,
    visibility: Property<DivVisibility>? = null,
    visibilityAction: Property<DivVisibilityAction>? = null,
    visibilityActions: Property<List<DivVisibilityAction>>? = null,
    width: Property<DivSize>? = null,
): LiteralProperty<DivTabs> {
    return value(DivTabs(
        accessibility = accessibility,
        alignmentHorizontal = alignmentHorizontal,
        alignmentVertical = alignmentVertical,
        alpha = alpha,
        background = background,
        border = border,
        columnSpan = columnSpan,
        dynamicHeight = dynamicHeight,
        extensions = extensions,
        focus = focus,
        hasSeparator = hasSeparator,
        height = height,
        id = id,
        items = items,
        margins = margins,
        paddings = paddings,
        restrictParentScroll = restrictParentScroll,
        rowSpan = rowSpan,
        selectedActions = selectedActions,
        selectedTab = selectedTab,
        separatorColor = separatorColor,
        separatorPaddings = separatorPaddings,
        switchTabsByContentSwipeEnabled = switchTabsByContentSwipeEnabled,
        tabTitleStyle = tabTitleStyle,
        titlePaddings = titlePaddings,
        tooltips = tooltips,
        transform = transform,
        transitionChange = transitionChange,
        transitionIn = transitionIn,
        transitionOut = transitionOut,
        transitionTriggers = transitionTriggers,
        visibility = visibility,
        visibilityAction = visibilityAction,
        visibilityActions = visibilityActions,
        width = width,
    ))
}

fun <T> TemplateContext<T>.divTabs(
    items: List<DivTabs.Item>? = null,
    accessibility: DivAccessibility? = null,
    alignmentHorizontal: DivAlignmentHorizontal? = null,
    alignmentVertical: DivAlignmentVertical? = null,
    alpha: Double? = null,
    background: List<DivBackground>? = null,
    border: DivBorder? = null,
    columnSpan: Int? = null,
    dynamicHeight: BoolInt? = null,
    extensions: List<DivExtension>? = null,
    focus: DivFocus? = null,
    hasSeparator: BoolInt? = null,
    height: DivSize? = null,
    id: String? = null,
    margins: DivEdgeInsets? = null,
    paddings: DivEdgeInsets? = null,
    restrictParentScroll: BoolInt? = null,
    rowSpan: Int? = null,
    selectedActions: List<DivAction>? = null,
    selectedTab: Int? = null,
    separatorColor: Color? = null,
    separatorPaddings: DivEdgeInsets? = null,
    switchTabsByContentSwipeEnabled: BoolInt? = null,
    tabTitleStyle: DivTabs.TabTitleStyle? = null,
    titlePaddings: DivEdgeInsets? = null,
    tooltips: List<DivTooltip>? = null,
    transform: DivTransform? = null,
    transitionChange: DivChangeTransition? = null,
    transitionIn: DivAppearanceTransition? = null,
    transitionOut: DivAppearanceTransition? = null,
    transitionTriggers: List<DivTransitionTrigger>? = null,
    visibility: DivVisibility? = null,
    visibilityAction: DivVisibilityAction? = null,
    visibilityActions: List<DivVisibilityAction>? = null,
    width: DivSize? = null,
): LiteralProperty<DivTabs> {
    return value(DivTabs(
        accessibility = optionalValue(accessibility),
        alignmentHorizontal = optionalValue(alignmentHorizontal),
        alignmentVertical = optionalValue(alignmentVertical),
        alpha = optionalValue(alpha),
        background = optionalValue(background),
        border = optionalValue(border),
        columnSpan = optionalValue(columnSpan),
        dynamicHeight = optionalValue(dynamicHeight),
        extensions = optionalValue(extensions),
        focus = optionalValue(focus),
        hasSeparator = optionalValue(hasSeparator),
        height = optionalValue(height),
        id = optionalValue(id),
        items = optionalValue(items),
        margins = optionalValue(margins),
        paddings = optionalValue(paddings),
        restrictParentScroll = optionalValue(restrictParentScroll),
        rowSpan = optionalValue(rowSpan),
        selectedActions = optionalValue(selectedActions),
        selectedTab = optionalValue(selectedTab),
        separatorColor = optionalValue(separatorColor),
        separatorPaddings = optionalValue(separatorPaddings),
        switchTabsByContentSwipeEnabled = optionalValue(switchTabsByContentSwipeEnabled),
        tabTitleStyle = optionalValue(tabTitleStyle),
        titlePaddings = optionalValue(titlePaddings),
        tooltips = optionalValue(tooltips),
        transform = optionalValue(transform),
        transitionChange = optionalValue(transitionChange),
        transitionIn = optionalValue(transitionIn),
        transitionOut = optionalValue(transitionOut),
        transitionTriggers = optionalValue(transitionTriggers),
        visibility = optionalValue(visibility),
        visibilityAction = optionalValue(visibilityAction),
        visibilityActions = optionalValue(visibilityActions),
        width = optionalValue(width),
    ))
}

fun <T> TemplateContext<T>.item(): LiteralProperty<DivTabs.Item> {
    return value(DivTabs.Item(
        div = null,
        title = null,
        titleClickAction = null,
    ))
}

fun <T> TemplateContext<T>.item(
    div: Property<Div>? = null,
    title: Property<String>? = null,
    titleClickAction: Property<DivAction>? = null,
): LiteralProperty<DivTabs.Item> {
    return value(DivTabs.Item(
        div = div,
        title = title,
        titleClickAction = titleClickAction,
    ))
}

fun <T> TemplateContext<T>.item(
    div: Div? = null,
    title: String? = null,
    titleClickAction: DivAction? = null,
): LiteralProperty<DivTabs.Item> {
    return value(DivTabs.Item(
        div = optionalValue(div),
        title = optionalValue(title),
        titleClickAction = optionalValue(titleClickAction),
    ))
}

fun <T> TemplateContext<T>.tabTitleStyle(): LiteralProperty<DivTabs.TabTitleStyle> {
    return value(DivTabs.TabTitleStyle(
        activeBackgroundColor = null,
        activeFontWeight = null,
        activeTextColor = null,
        animationDuration = null,
        animationType = null,
        cornerRadius = null,
        cornersRadius = null,
        fontFamily = null,
        fontSize = null,
        fontSizeUnit = null,
        fontWeight = null,
        inactiveBackgroundColor = null,
        inactiveFontWeight = null,
        inactiveTextColor = null,
        itemSpacing = null,
        letterSpacing = null,
        lineHeight = null,
        paddings = null,
    ))
}

fun <T> TemplateContext<T>.tabTitleStyle(
    activeBackgroundColor: Property<Color>? = null,
    activeFontWeight: Property<DivFontWeight>? = null,
    activeTextColor: Property<Color>? = null,
    animationDuration: Property<Int>? = null,
    animationType: Property<DivTabs.TabTitleStyle.AnimationType>? = null,
    cornerRadius: Property<Int>? = null,
    cornersRadius: Property<DivCornersRadius>? = null,
    fontFamily: Property<DivFontFamily>? = null,
    fontSize: Property<Int>? = null,
    fontSizeUnit: Property<DivSizeUnit>? = null,
    fontWeight: Property<DivFontWeight>? = null,
    inactiveBackgroundColor: Property<Color>? = null,
    inactiveFontWeight: Property<DivFontWeight>? = null,
    inactiveTextColor: Property<Color>? = null,
    itemSpacing: Property<Int>? = null,
    letterSpacing: Property<Double>? = null,
    lineHeight: Property<Int>? = null,
    paddings: Property<DivEdgeInsets>? = null,
): LiteralProperty<DivTabs.TabTitleStyle> {
    return value(DivTabs.TabTitleStyle(
        activeBackgroundColor = activeBackgroundColor,
        activeFontWeight = activeFontWeight,
        activeTextColor = activeTextColor,
        animationDuration = animationDuration,
        animationType = animationType,
        cornerRadius = cornerRadius,
        cornersRadius = cornersRadius,
        fontFamily = fontFamily,
        fontSize = fontSize,
        fontSizeUnit = fontSizeUnit,
        fontWeight = fontWeight,
        inactiveBackgroundColor = inactiveBackgroundColor,
        inactiveFontWeight = inactiveFontWeight,
        inactiveTextColor = inactiveTextColor,
        itemSpacing = itemSpacing,
        letterSpacing = letterSpacing,
        lineHeight = lineHeight,
        paddings = paddings,
    ))
}

fun <T> TemplateContext<T>.tabTitleStyle(
    activeBackgroundColor: Color? = null,
    activeFontWeight: DivFontWeight? = null,
    activeTextColor: Color? = null,
    animationDuration: Int? = null,
    animationType: DivTabs.TabTitleStyle.AnimationType? = null,
    cornerRadius: Int? = null,
    cornersRadius: DivCornersRadius? = null,
    fontFamily: DivFontFamily? = null,
    fontSize: Int? = null,
    fontSizeUnit: DivSizeUnit? = null,
    fontWeight: DivFontWeight? = null,
    inactiveBackgroundColor: Color? = null,
    inactiveFontWeight: DivFontWeight? = null,
    inactiveTextColor: Color? = null,
    itemSpacing: Int? = null,
    letterSpacing: Double? = null,
    lineHeight: Int? = null,
    paddings: DivEdgeInsets? = null,
): LiteralProperty<DivTabs.TabTitleStyle> {
    return value(DivTabs.TabTitleStyle(
        activeBackgroundColor = optionalValue(activeBackgroundColor),
        activeFontWeight = optionalValue(activeFontWeight),
        activeTextColor = optionalValue(activeTextColor),
        animationDuration = optionalValue(animationDuration),
        animationType = optionalValue(animationType),
        cornerRadius = optionalValue(cornerRadius),
        cornersRadius = optionalValue(cornersRadius),
        fontFamily = optionalValue(fontFamily),
        fontSize = optionalValue(fontSize),
        fontSizeUnit = optionalValue(fontSizeUnit),
        fontWeight = optionalValue(fontWeight),
        inactiveBackgroundColor = optionalValue(inactiveBackgroundColor),
        inactiveFontWeight = optionalValue(inactiveFontWeight),
        inactiveTextColor = optionalValue(inactiveTextColor),
        itemSpacing = optionalValue(itemSpacing),
        letterSpacing = optionalValue(letterSpacing),
        lineHeight = optionalValue(lineHeight),
        paddings = optionalValue(paddings),
    ))
}

fun CardContext.divTabs(
    items: ValueProperty<List<DivTabs.Item>>,
    accessibility: ValueProperty<DivAccessibility>? = null,
    alignmentHorizontal: ValueProperty<DivAlignmentHorizontal>? = null,
    alignmentVertical: ValueProperty<DivAlignmentVertical>? = null,
    alpha: ValueProperty<Double>? = null,
    background: ValueProperty<List<DivBackground>>? = null,
    border: ValueProperty<DivBorder>? = null,
    columnSpan: ValueProperty<Int>? = null,
    dynamicHeight: ValueProperty<BoolInt>? = null,
    extensions: ValueProperty<List<DivExtension>>? = null,
    focus: ValueProperty<DivFocus>? = null,
    hasSeparator: ValueProperty<BoolInt>? = null,
    height: ValueProperty<DivSize>? = null,
    id: ValueProperty<String>? = null,
    margins: ValueProperty<DivEdgeInsets>? = null,
    paddings: ValueProperty<DivEdgeInsets>? = null,
    restrictParentScroll: ValueProperty<BoolInt>? = null,
    rowSpan: ValueProperty<Int>? = null,
    selectedActions: ValueProperty<List<DivAction>>? = null,
    selectedTab: ValueProperty<Int>? = null,
    separatorColor: ValueProperty<Color>? = null,
    separatorPaddings: ValueProperty<DivEdgeInsets>? = null,
    switchTabsByContentSwipeEnabled: ValueProperty<BoolInt>? = null,
    tabTitleStyle: ValueProperty<DivTabs.TabTitleStyle>? = null,
    titlePaddings: ValueProperty<DivEdgeInsets>? = null,
    tooltips: ValueProperty<List<DivTooltip>>? = null,
    transform: ValueProperty<DivTransform>? = null,
    transitionChange: ValueProperty<DivChangeTransition>? = null,
    transitionIn: ValueProperty<DivAppearanceTransition>? = null,
    transitionOut: ValueProperty<DivAppearanceTransition>? = null,
    transitionTriggers: ValueProperty<List<DivTransitionTrigger>>? = null,
    visibility: ValueProperty<DivVisibility>? = null,
    visibilityAction: ValueProperty<DivVisibilityAction>? = null,
    visibilityActions: ValueProperty<List<DivVisibilityAction>>? = null,
    width: ValueProperty<DivSize>? = null,
): DivTabs {
    return DivTabs(
        accessibility = accessibility,
        alignmentHorizontal = alignmentHorizontal,
        alignmentVertical = alignmentVertical,
        alpha = alpha,
        background = background,
        border = border,
        columnSpan = columnSpan,
        dynamicHeight = dynamicHeight,
        extensions = extensions,
        focus = focus,
        hasSeparator = hasSeparator,
        height = height,
        id = id,
        items = items,
        margins = margins,
        paddings = paddings,
        restrictParentScroll = restrictParentScroll,
        rowSpan = rowSpan,
        selectedActions = selectedActions,
        selectedTab = selectedTab,
        separatorColor = separatorColor,
        separatorPaddings = separatorPaddings,
        switchTabsByContentSwipeEnabled = switchTabsByContentSwipeEnabled,
        tabTitleStyle = tabTitleStyle,
        titlePaddings = titlePaddings,
        tooltips = tooltips,
        transform = transform,
        transitionChange = transitionChange,
        transitionIn = transitionIn,
        transitionOut = transitionOut,
        transitionTriggers = transitionTriggers,
        visibility = visibility,
        visibilityAction = visibilityAction,
        visibilityActions = visibilityActions,
        width = width,
    )
}

fun CardContext.divTabs(
    items: List<DivTabs.Item>,
    accessibility: DivAccessibility? = null,
    alignmentHorizontal: DivAlignmentHorizontal? = null,
    alignmentVertical: DivAlignmentVertical? = null,
    alpha: Double? = null,
    background: List<DivBackground>? = null,
    border: DivBorder? = null,
    columnSpan: Int? = null,
    dynamicHeight: BoolInt? = null,
    extensions: List<DivExtension>? = null,
    focus: DivFocus? = null,
    hasSeparator: BoolInt? = null,
    height: DivSize? = null,
    id: String? = null,
    margins: DivEdgeInsets? = null,
    paddings: DivEdgeInsets? = null,
    restrictParentScroll: BoolInt? = null,
    rowSpan: Int? = null,
    selectedActions: List<DivAction>? = null,
    selectedTab: Int? = null,
    separatorColor: Color? = null,
    separatorPaddings: DivEdgeInsets? = null,
    switchTabsByContentSwipeEnabled: BoolInt? = null,
    tabTitleStyle: DivTabs.TabTitleStyle? = null,
    titlePaddings: DivEdgeInsets? = null,
    tooltips: List<DivTooltip>? = null,
    transform: DivTransform? = null,
    transitionChange: DivChangeTransition? = null,
    transitionIn: DivAppearanceTransition? = null,
    transitionOut: DivAppearanceTransition? = null,
    transitionTriggers: List<DivTransitionTrigger>? = null,
    visibility: DivVisibility? = null,
    visibilityAction: DivVisibilityAction? = null,
    visibilityActions: List<DivVisibilityAction>? = null,
    width: DivSize? = null,
): DivTabs {
    return DivTabs(
        accessibility = optionalValue(accessibility),
        alignmentHorizontal = optionalValue(alignmentHorizontal),
        alignmentVertical = optionalValue(alignmentVertical),
        alpha = optionalValue(alpha),
        background = optionalValue(background),
        border = optionalValue(border),
        columnSpan = optionalValue(columnSpan),
        dynamicHeight = optionalValue(dynamicHeight),
        extensions = optionalValue(extensions),
        focus = optionalValue(focus),
        hasSeparator = optionalValue(hasSeparator),
        height = optionalValue(height),
        id = optionalValue(id),
        items = value(items),
        margins = optionalValue(margins),
        paddings = optionalValue(paddings),
        restrictParentScroll = optionalValue(restrictParentScroll),
        rowSpan = optionalValue(rowSpan),
        selectedActions = optionalValue(selectedActions),
        selectedTab = optionalValue(selectedTab),
        separatorColor = optionalValue(separatorColor),
        separatorPaddings = optionalValue(separatorPaddings),
        switchTabsByContentSwipeEnabled = optionalValue(switchTabsByContentSwipeEnabled),
        tabTitleStyle = optionalValue(tabTitleStyle),
        titlePaddings = optionalValue(titlePaddings),
        tooltips = optionalValue(tooltips),
        transform = optionalValue(transform),
        transitionChange = optionalValue(transitionChange),
        transitionIn = optionalValue(transitionIn),
        transitionOut = optionalValue(transitionOut),
        transitionTriggers = optionalValue(transitionTriggers),
        visibility = optionalValue(visibility),
        visibilityAction = optionalValue(visibilityAction),
        visibilityActions = optionalValue(visibilityActions),
        width = optionalValue(width),
    )
}

fun CardContext.item(
    div: ValueProperty<Div>,
    title: ValueProperty<String>,
    titleClickAction: ValueProperty<DivAction>? = null,
): DivTabs.Item {
    return DivTabs.Item(
        div = div,
        title = title,
        titleClickAction = titleClickAction,
    )
}

fun CardContext.item(
    div: Div,
    title: String,
    titleClickAction: DivAction? = null,
): DivTabs.Item {
    return DivTabs.Item(
        div = value(div),
        title = value(title),
        titleClickAction = optionalValue(titleClickAction),
    )
}

fun CardContext.tabTitleStyle(): DivTabs.TabTitleStyle {
    return DivTabs.TabTitleStyle(
        activeBackgroundColor = null,
        activeFontWeight = null,
        activeTextColor = null,
        animationDuration = null,
        animationType = null,
        cornerRadius = null,
        cornersRadius = null,
        fontFamily = null,
        fontSize = null,
        fontSizeUnit = null,
        fontWeight = null,
        inactiveBackgroundColor = null,
        inactiveFontWeight = null,
        inactiveTextColor = null,
        itemSpacing = null,
        letterSpacing = null,
        lineHeight = null,
        paddings = null,
    )
}

fun CardContext.tabTitleStyle(
    activeBackgroundColor: ValueProperty<Color>? = null,
    activeFontWeight: ValueProperty<DivFontWeight>? = null,
    activeTextColor: ValueProperty<Color>? = null,
    animationDuration: ValueProperty<Int>? = null,
    animationType: ValueProperty<DivTabs.TabTitleStyle.AnimationType>? = null,
    cornerRadius: ValueProperty<Int>? = null,
    cornersRadius: ValueProperty<DivCornersRadius>? = null,
    fontFamily: ValueProperty<DivFontFamily>? = null,
    fontSize: ValueProperty<Int>? = null,
    fontSizeUnit: ValueProperty<DivSizeUnit>? = null,
    fontWeight: ValueProperty<DivFontWeight>? = null,
    inactiveBackgroundColor: ValueProperty<Color>? = null,
    inactiveFontWeight: ValueProperty<DivFontWeight>? = null,
    inactiveTextColor: ValueProperty<Color>? = null,
    itemSpacing: ValueProperty<Int>? = null,
    letterSpacing: ValueProperty<Double>? = null,
    lineHeight: ValueProperty<Int>? = null,
    paddings: ValueProperty<DivEdgeInsets>? = null,
): DivTabs.TabTitleStyle {
    return DivTabs.TabTitleStyle(
        activeBackgroundColor = activeBackgroundColor,
        activeFontWeight = activeFontWeight,
        activeTextColor = activeTextColor,
        animationDuration = animationDuration,
        animationType = animationType,
        cornerRadius = cornerRadius,
        cornersRadius = cornersRadius,
        fontFamily = fontFamily,
        fontSize = fontSize,
        fontSizeUnit = fontSizeUnit,
        fontWeight = fontWeight,
        inactiveBackgroundColor = inactiveBackgroundColor,
        inactiveFontWeight = inactiveFontWeight,
        inactiveTextColor = inactiveTextColor,
        itemSpacing = itemSpacing,
        letterSpacing = letterSpacing,
        lineHeight = lineHeight,
        paddings = paddings,
    )
}

fun CardContext.tabTitleStyle(
    activeBackgroundColor: Color? = null,
    activeFontWeight: DivFontWeight? = null,
    activeTextColor: Color? = null,
    animationDuration: Int? = null,
    animationType: DivTabs.TabTitleStyle.AnimationType? = null,
    cornerRadius: Int? = null,
    cornersRadius: DivCornersRadius? = null,
    fontFamily: DivFontFamily? = null,
    fontSize: Int? = null,
    fontSizeUnit: DivSizeUnit? = null,
    fontWeight: DivFontWeight? = null,
    inactiveBackgroundColor: Color? = null,
    inactiveFontWeight: DivFontWeight? = null,
    inactiveTextColor: Color? = null,
    itemSpacing: Int? = null,
    letterSpacing: Double? = null,
    lineHeight: Int? = null,
    paddings: DivEdgeInsets? = null,
): DivTabs.TabTitleStyle {
    return DivTabs.TabTitleStyle(
        activeBackgroundColor = optionalValue(activeBackgroundColor),
        activeFontWeight = optionalValue(activeFontWeight),
        activeTextColor = optionalValue(activeTextColor),
        animationDuration = optionalValue(animationDuration),
        animationType = optionalValue(animationType),
        cornerRadius = optionalValue(cornerRadius),
        cornersRadius = optionalValue(cornersRadius),
        fontFamily = optionalValue(fontFamily),
        fontSize = optionalValue(fontSize),
        fontSizeUnit = optionalValue(fontSizeUnit),
        fontWeight = optionalValue(fontWeight),
        inactiveBackgroundColor = optionalValue(inactiveBackgroundColor),
        inactiveFontWeight = optionalValue(inactiveFontWeight),
        inactiveTextColor = optionalValue(inactiveTextColor),
        itemSpacing = optionalValue(itemSpacing),
        letterSpacing = optionalValue(letterSpacing),
        lineHeight = optionalValue(lineHeight),
        paddings = optionalValue(paddings),
    )
}
