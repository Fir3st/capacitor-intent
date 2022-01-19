import { registerPlugin } from '@capacitor/core';

import type { CapacitorIntentPlugin } from './definitions';

const CapacitorIntent = registerPlugin<CapacitorIntentPlugin>('CapacitorIntent', {});

export * from './definitions';
export * from './constants';
export { CapacitorIntent };
