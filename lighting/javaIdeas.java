lampsPerFlicker = Math.max(5, lampsPerFlicker);

flickerChance = Math.clamp(flickerChance, 0.0, 0.75);

maxDelayTicks = Math.max(maxDelayTicks, minDelayTicks);

if (flickerCount.max < flickerCount.min) {
    throw new IllegalStateException(
        "Invalid flickerCount: man (" + flickerCount.max + ") is less than min (" + flickerCount.min + ")"
    );
}
