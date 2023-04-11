To create a dynamic button component in Angular, you can use Angular's built-in `Component` decorator and `@Input` decorator.

First, create a new component using the `ng generate component` command or manually creating the component files. For example, let's call our component `dynamic-button`.

In the `dynamic-button.component.ts` file, define the `@Input` properties for the button's text and click event:

```typescript
import { Component, Input } from "@angular/core";

@Component({
  selector: "app-dynamic-button",
  template: `<button (click)="onClick()">{{ text }}</button>`,
})
export class DynamicButtonComponent {
  @Input() text: string;
  @Input() onClick: () => void;
}
```

In the `dynamic-button.component.html` file, include the `app-dynamic-button` selector with the `text` and `onClick` properties bound to the parent component:

```html
<app-dynamic-button
  [text]="buttonText"
  [onClick]="onButtonClick"
></app-dynamic-button>
```

In the parent component, define the `buttonText` and `onButtonClick` properties, and pass them to the `DynamicButtonComponent`:

```typescript
import { Component } from "@angular/core";

@Component({
  selector: "app-parent-component",
  template: `<app-dynamic-button
    [text]="buttonText"
    [onClick]="onButtonClick"
  ></app-dynamic-button>`,
})
export class ParentComponent {
  buttonText = "Click me";
  onButtonClick() {
    console.log("Button clicked");
  }
}
```

Now, when the `DynamicButtonComponent` is rendered, it will display a button with the text "Click me". When the button is clicked, it will call the `onButtonClick` function defined in the parent component.

You can also customize the `DynamicButtonComponent` further by adding CSS classes or styling to the button element in the `template` property of the component decorator.
