export interface CapacitorIntentPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
