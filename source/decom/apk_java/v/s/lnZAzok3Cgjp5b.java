package v.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1;
import v.s.BX0oSm0gHuRLDLc;
import v.s.ZJlcpjYrQWz153DG4;
import v.s.fEyMFFyOOvHURJ7To6L;
import v.s.lnZAzok3Cgjp5b;
import v.s.wd5znjw64zDkhZAmgre;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lnZAzok3Cgjp5b extends nqLgv0zSLN5zLWr3 {
    public final /* synthetic */ int ibVTtJUNfrGYbW;
    public final BroadcastReceiverConstraintTracker$broadcastReceiver$1 xDyLpEZyrcKVe0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1] */
    public lnZAzok3Cgjp5b(Context context, fUH025aw0Rgl fuh025aw0rgl, int i) {
        super(context, fuh025aw0rgl);
        this.ibVTtJUNfrGYbW = i;
        this.xDyLpEZyrcKVe0 = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            private static /* synthetic */ void mjxvp() {
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                lnZAzok3Cgjp5b lnzazok3cgjp5b = this.dDIMxZXP1V8HdM;
                switch (lnzazok3cgjp5b.ibVTtJUNfrGYbW) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                            int i2 = wd5znjw64zDkhZAmgre.dDIMxZXP1V8HdM;
                            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        lnzazok3cgjp5b.w9sT1Swbhx3hs(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        lnzazok3cgjp5b.w9sT1Swbhx3hs(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        lnzazok3cgjp5b.w9sT1Swbhx3hs(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        lnzazok3cgjp5b.w9sT1Swbhx3hs(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                            int i3 = ZJlcpjYrQWz153DG4.dDIMxZXP1V8HdM;
                            intent.getAction();
                            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        lnzazok3cgjp5b.w9sT1Swbhx3hs(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    lnzazok3cgjp5b.w9sT1Swbhx3hs(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                            int i4 = BX0oSm0gHuRLDLc.dDIMxZXP1V8HdM;
                            intent.getAction();
                            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3.getClass();
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        lnzazok3cgjp5b.w9sT1Swbhx3hs(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    lnzazok3cgjp5b.w9sT1Swbhx3hs(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
    }

    private static /* synthetic */ void pqkwoei() {
    }

    public final IntentFilter Ee8d2j4S9Vm5yGuR() {
        switch (this.ibVTtJUNfrGYbW) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    @Override // v.s.nqLgv0zSLN5zLWr3
    public final void JXn4Qf7zpnLjP5() {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        int i = ipeGjr8NBfqIBanwJ.dDIMxZXP1V8HdM;
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        this.w9sT1Swbhx3hs.unregisterReceiver(this.xDyLpEZyrcKVe0);
    }

    @Override // v.s.nqLgv0zSLN5zLWr3
    public final Object dDIMxZXP1V8HdM() {
        int i = this.ibVTtJUNfrGYbW;
        Context context = this.w9sT1Swbhx3hs;
        boolean z = true;
        switch (i) {
            case 0:
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    int i2 = wd5znjw64zDkhZAmgre.dDIMxZXP1V8HdM;
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 65 - 63 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    int i3 = ZJlcpjYrQWz153DG4.dDIMxZXP1V8HdM;
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = context.registerReceiver(null, Ee8d2j4S9Vm5yGuR());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // v.s.nqLgv0zSLN5zLWr3
    public final void vekpFI4d1Nc4fakF() {
        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
        int i = ipeGjr8NBfqIBanwJ.dDIMxZXP1V8HdM;
        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
        this.w9sT1Swbhx3hs.registerReceiver(this.xDyLpEZyrcKVe0, Ee8d2j4S9Vm5yGuR());
    }
}
