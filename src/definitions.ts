export interface CapacitorIntentOptions {
  url?: string;
  action?: string;
}

export interface CapacitorIntentPlugin {
  pluginName: string;
  startActivity(options: CapacitorIntentOptions): Promise<void>;
}
