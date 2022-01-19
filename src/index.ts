import { registerPlugin } from '@capacitor/core';

import type { CapacitorIntentPlugin } from './definitions';

const CapacitorIntent = registerPlugin<CapacitorIntentPlugin>('CapacitorIntent', {
  web: () => import('./web').then(m => new m.CapacitorIntentWeb()),
});

export * from './definitions';
export { CapacitorIntent };
