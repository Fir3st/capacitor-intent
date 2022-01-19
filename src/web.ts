import { WebPlugin } from '@capacitor/core';

import type { CapacitorIntentPlugin } from './definitions';

export class CapacitorIntentWeb extends WebPlugin implements CapacitorIntentPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
