# capacitor-intent

Plugin for executing android intents from Capacitor app

Requires Capacitor 8 or newer.

## Install

```bash
npm install capacitor-intent
npx cap sync
```

## Usage

```typescript
import { ACTION_VIEW, CapacitorIntent } from 'capacitor-intent';

await CapacitorIntent.startActivity({
  action: ACTION_VIEW,
  url: 'https://capacitorjs.com',
});
```

## Upgrading from 0.x

Version 1.0.0 requires Capacitor 8. If your app is still on Capacitor 3 or 4, stay on `capacitor-intent@0.0.2`.

## API

<docgen-index>

* [`startActivity(...)`](#startactivity)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### startActivity(...)

```typescript
startActivity(options: CapacitorIntentOptions) => Promise<void>
```

| Param         | Type                                                                      |
| ------------- | ------------------------------------------------------------------------- |
| **`options`** | <code><a href="#capacitorintentoptions">CapacitorIntentOptions</a></code> |

--------------------


### Interfaces


#### CapacitorIntentOptions

| Prop         | Type                |
| ------------ | ------------------- |
| **`url`**    | <code>string</code> |
| **`action`** | <code>string</code> |

</docgen-api>
