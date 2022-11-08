// Generated code. Do not modify.

package com.yandex.div.dsl.model

import java.net.URI
import com.fasterxml.jackson.annotation.*
import com.yandex.div.dsl.*
import com.yandex.div.dsl.context.*
import com.yandex.div.dsl.type.*
import com.yandex.div.dsl.util.*

class DivCustom internal constructor(
    @JsonIgnore override val accessibility: Property<DivAccessibility>?,
    @JsonIgnore override val alignmentHorizontal: Property<DivAlignmentHorizontal>?,
    @JsonIgnore override val alignmentVertical: Property<DivAlignmentVertical>?,
    @JsonIgnore override val alpha: Property<Double>?,
    @JsonIgnore override val background: Property<List<DivBackground>>?,
    @JsonIgnore override val border: Property<DivBorder>?,
    @JsonIgnore override val columnSpan: Property<Int>?,
    @JsonIgnore val customProps: Property<Map<String, Any>>?,
    @JsonIgnore val customType: Property<String>?,
    @JsonIgnore override val extensions: Property<List<DivExtension>>?,
    @JsonIgnore override val focus: Property<DivFocus>?,
    @JsonIgnore override val height: Property<DivSize>?,
    @JsonIgnore override val id: Property<String>?,
    @JsonIgnore val items: Property<List<Div>>?,
    @JsonIgnore override val margins: Property<DivEdgeInsets>?,
    @JsonIgnore override val paddings: Property<DivEdgeInsets>?,
    @JsonIgnore override val rowSpan: Property<Int>?,
    @JsonIgnore override val selectedActions: Property<List<DivAction>>?,
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

    @JsonProperty("type") override val type = "custom"

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
            "custom_props" to customProps,
            "custom_type" to customType,
            "extensions" to extensions,
            "focus" to focus,
            "height" to height,
            "id" to id,
            "items" to items,
            "margins" to margins,
            "paddings" to paddings,
            "row_span" to rowSpan,
            "selected_actions" to selectedActions,
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
}

fun <T> TemplateContext<T>.divCustom(): LiteralProperty<DivCustom> {
    return value(DivCustom(
        accessibility = null,
        alignmentHorizontal = null,
        alignmentVertical = null,
        alpha = null,
        background = null,
        border = null,
        columnSpan = null,
        customProps = null,
        customType = null,
        extensions = null,
        focus = null,
        height = null,
        id = null,
        items = null,
        margins = null,
        paddings = null,
        rowSpan = null,
        selectedActions = null,
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

fun <T> TemplateContext<T>.divCustom(
    customType: Property<String>? = null,
    accessibility: Property<DivAccessibility>? = null,
    alignmentHorizontal: Property<DivAlignmentHorizontal>? = null,
    alignmentVertical: Property<DivAlignmentVertical>? = null,
    alpha: Property<Double>? = null,
    background: Property<List<DivBackground>>? = null,
    border: Property<DivBorder>? = null,
    columnSpan: Property<Int>? = null,
    customProps: Property<Map<String, Any>>? = null,
    extensions: Property<List<DivExtension>>? = null,
    focus: Property<DivFocus>? = null,
    height: Property<DivSize>? = null,
    id: Property<String>? = null,
    items: Property<List<Div>>? = null,
    margins: Property<DivEdgeInsets>? = null,
    paddings: Property<DivEdgeInsets>? = null,
    rowSpan: Property<Int>? = null,
    selectedActions: Property<List<DivAction>>? = null,
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
): LiteralProperty<DivCustom> {
    return value(DivCustom(
        accessibility = accessibility,
        alignmentHorizontal = alignmentHorizontal,
        alignmentVertical = alignmentVertical,
        alpha = alpha,
        background = background,
        border = border,
        columnSpan = columnSpan,
        customProps = customProps,
        customType = customType,
        extensions = extensions,
        focus = focus,
        height = height,
        id = id,
        items = items,
        margins = margins,
        paddings = paddings,
        rowSpan = rowSpan,
        selectedActions = selectedActions,
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

fun <T> TemplateContext<T>.divCustom(
    customType: String? = null,
    accessibility: DivAccessibility? = null,
    alignmentHorizontal: DivAlignmentHorizontal? = null,
    alignmentVertical: DivAlignmentVertical? = null,
    alpha: Double? = null,
    background: List<DivBackground>? = null,
    border: DivBorder? = null,
    columnSpan: Int? = null,
    customProps: Map<String, Any>? = null,
    extensions: List<DivExtension>? = null,
    focus: DivFocus? = null,
    height: DivSize? = null,
    id: String? = null,
    items: List<Div>? = null,
    margins: DivEdgeInsets? = null,
    paddings: DivEdgeInsets? = null,
    rowSpan: Int? = null,
    selectedActions: List<DivAction>? = null,
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
): LiteralProperty<DivCustom> {
    return value(DivCustom(
        accessibility = optionalValue(accessibility),
        alignmentHorizontal = optionalValue(alignmentHorizontal),
        alignmentVertical = optionalValue(alignmentVertical),
        alpha = optionalValue(alpha),
        background = optionalValue(background),
        border = optionalValue(border),
        columnSpan = optionalValue(columnSpan),
        customProps = optionalValue(customProps),
        customType = optionalValue(customType),
        extensions = optionalValue(extensions),
        focus = optionalValue(focus),
        height = optionalValue(height),
        id = optionalValue(id),
        items = optionalValue(items),
        margins = optionalValue(margins),
        paddings = optionalValue(paddings),
        rowSpan = optionalValue(rowSpan),
        selectedActions = optionalValue(selectedActions),
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

fun CardContext.divCustom(
    customType: ValueProperty<String>,
    accessibility: ValueProperty<DivAccessibility>? = null,
    alignmentHorizontal: ValueProperty<DivAlignmentHorizontal>? = null,
    alignmentVertical: ValueProperty<DivAlignmentVertical>? = null,
    alpha: ValueProperty<Double>? = null,
    background: ValueProperty<List<DivBackground>>? = null,
    border: ValueProperty<DivBorder>? = null,
    columnSpan: ValueProperty<Int>? = null,
    customProps: ValueProperty<Map<String, Any>>? = null,
    extensions: ValueProperty<List<DivExtension>>? = null,
    focus: ValueProperty<DivFocus>? = null,
    height: ValueProperty<DivSize>? = null,
    id: ValueProperty<String>? = null,
    items: ValueProperty<List<Div>>? = null,
    margins: ValueProperty<DivEdgeInsets>? = null,
    paddings: ValueProperty<DivEdgeInsets>? = null,
    rowSpan: ValueProperty<Int>? = null,
    selectedActions: ValueProperty<List<DivAction>>? = null,
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
): DivCustom {
    return DivCustom(
        accessibility = accessibility,
        alignmentHorizontal = alignmentHorizontal,
        alignmentVertical = alignmentVertical,
        alpha = alpha,
        background = background,
        border = border,
        columnSpan = columnSpan,
        customProps = customProps,
        customType = customType,
        extensions = extensions,
        focus = focus,
        height = height,
        id = id,
        items = items,
        margins = margins,
        paddings = paddings,
        rowSpan = rowSpan,
        selectedActions = selectedActions,
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

fun CardContext.divCustom(
    customType: String,
    accessibility: DivAccessibility? = null,
    alignmentHorizontal: DivAlignmentHorizontal? = null,
    alignmentVertical: DivAlignmentVertical? = null,
    alpha: Double? = null,
    background: List<DivBackground>? = null,
    border: DivBorder? = null,
    columnSpan: Int? = null,
    customProps: Map<String, Any>? = null,
    extensions: List<DivExtension>? = null,
    focus: DivFocus? = null,
    height: DivSize? = null,
    id: String? = null,
    items: List<Div>? = null,
    margins: DivEdgeInsets? = null,
    paddings: DivEdgeInsets? = null,
    rowSpan: Int? = null,
    selectedActions: List<DivAction>? = null,
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
): DivCustom {
    return DivCustom(
        accessibility = optionalValue(accessibility),
        alignmentHorizontal = optionalValue(alignmentHorizontal),
        alignmentVertical = optionalValue(alignmentVertical),
        alpha = optionalValue(alpha),
        background = optionalValue(background),
        border = optionalValue(border),
        columnSpan = optionalValue(columnSpan),
        customProps = optionalValue(customProps),
        customType = value(customType),
        extensions = optionalValue(extensions),
        focus = optionalValue(focus),
        height = optionalValue(height),
        id = optionalValue(id),
        items = optionalValue(items),
        margins = optionalValue(margins),
        paddings = optionalValue(paddings),
        rowSpan = optionalValue(rowSpan),
        selectedActions = optionalValue(selectedActions),
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
