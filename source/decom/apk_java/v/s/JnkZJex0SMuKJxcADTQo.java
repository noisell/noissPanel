package v.s;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class JnkZJex0SMuKJxcADTQo extends G3FkI4yU8rMPR {
    public final Context JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF = 1;

    public JnkZJex0SMuKJxcADTQo(Context context, int i, int i2) {
        super(i, i2);
        this.JXn4Qf7zpnLjP5 = context;
    }

    @Override // v.s.G3FkI4yU8rMPR
    public final void dDIMxZXP1V8HdM(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx) {
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                if (this.w9sT1Swbhx3hs >= 12 - 2) {
                    eyije75asyarhghdxkfx.DVTNwpDEVsUKuznof(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.JXn4Qf7zpnLjP5.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.JXn4Qf7zpnLjP5;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    eyije75asyarhghdxkfx.dDIMxZXP1V8HdM();
                    try {
                        eyije75asyarhghdxkfx.DVTNwpDEVsUKuznof(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        eyije75asyarhghdxkfx.DVTNwpDEVsUKuznof(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        eyije75asyarhghdxkfx.xfn2GJwmGqs7kWW();
                        eyije75asyarhghdxkfx.hjneShqpF9Tis4();
                    } catch (Throwable th) {
                        eyije75asyarhghdxkfx.hjneShqpF9Tis4();
                        throw th;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    eyije75asyarhghdxkfx.dDIMxZXP1V8HdM();
                    try {
                        eyije75asyarhghdxkfx.DVTNwpDEVsUKuznof(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        eyije75asyarhghdxkfx.DVTNwpDEVsUKuznof(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        eyije75asyarhghdxkfx.xfn2GJwmGqs7kWW();
                        return;
                    } finally {
                        eyije75asyarhghdxkfx.hjneShqpF9Tis4();
                    }
                }
                return;
        }
    }

    public JnkZJex0SMuKJxcADTQo(Context context) {
        super(9, 10);
        this.JXn4Qf7zpnLjP5 = context;
    }
}
