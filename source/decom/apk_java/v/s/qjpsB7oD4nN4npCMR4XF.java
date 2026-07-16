package v.s;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import app.mobilex.plus.services.SyncQYAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class qjpsB7oD4nN4npCMR4XF implements Runnable {
    public final Object Ee8d2j4S9Vm5yGuR;
    public final Object JXn4Qf7zpnLjP5;
    public final Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ qjpsB7oD4nN4npCMR4XF(Object obj, Object obj2, Object obj3, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
        this.JXn4Qf7zpnLjP5 = obj2;
        this.Ee8d2j4S9Vm5yGuR = obj3;
    }

    private static /* synthetic */ void wfyqupo() {
    }

    public ArrayList dDIMxZXP1V8HdM() {
        int i;
        int i2;
        long j;
        long jW9sT1Swbhx3hs;
        nLrxl2ExJj45rGBsZNLQ nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd = ((bIQtXpTQsEoGIf25Z) this.JXn4Qf7zpnLjP5).b1EoSIRjJHO5.XiR1pIn5878vVWd();
        String str = (String) this.Ee8d2j4S9Vm5yGuR;
        WorkDatabase_Impl workDatabase_Impl = nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.dDIMxZXP1V8HdM;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
        } else {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        }
        workDatabase_Impl.w9sT1Swbhx3hs();
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            Cursor cursorB1EoSIRjJHO5 = RIZfHbqXpth8r2yN4.b1EoSIRjJHO5(workDatabase_Impl, ez6sozeos7kkqzccqforD5P1xCAyuvgF);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (true) {
                    i = 0;
                    if (!cursorB1EoSIRjJHO5.moveToNext()) {
                        break;
                    }
                    String string = cursorB1EoSIRjJHO5.getString(0);
                    if (((ArrayList) map.get(string)) == null) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorB1EoSIRjJHO5.getString(0);
                    if (((ArrayList) map2.get(string2)) == null) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorB1EoSIRjJHO5.moveToPosition(-1);
                nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.w9sT1Swbhx3hs(map);
                nlrxl2exjj45rgbsznlqXiR1pIn5878vVWd.dDIMxZXP1V8HdM(map2);
                ArrayList arrayList = new ArrayList(cursorB1EoSIRjJHO5.getCount());
                while (cursorB1EoSIRjJHO5.moveToNext()) {
                    String string3 = cursorB1EoSIRjJHO5.isNull(0) ? null : cursorB1EoSIRjJHO5.getString(0);
                    int iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(cursorB1EoSIRjJHO5.getInt(1));
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorB1EoSIRjJHO5.isNull(2) ? null : cursorB1EoSIRjJHO5.getBlob(2));
                    int i3 = cursorB1EoSIRjJHO5.getInt(3);
                    int i4 = cursorB1EoSIRjJHO5.getInt(4);
                    long j2 = cursorB1EoSIRjJHO5.getLong(13);
                    long j3 = cursorB1EoSIRjJHO5.getLong(14);
                    long j4 = cursorB1EoSIRjJHO5.getLong(15);
                    int iGIIiyi2ddlMDR0 = jb8et6SZeK5TWMrJFxDX.gIIiyi2ddlMDR0(cursorB1EoSIRjJHO5.getInt(16));
                    long j5 = cursorB1EoSIRjJHO5.getLong(17);
                    long j6 = cursorB1EoSIRjJHO5.getLong(18);
                    int i5 = cursorB1EoSIRjJHO5.getInt(19);
                    long j7 = cursorB1EoSIRjJHO5.getLong(20);
                    int i6 = cursorB1EoSIRjJHO5.getInt(21);
                    RdWywP7AQUqPn0G rdWywP7AQUqPn0G = new RdWywP7AQUqPn0G(jb8et6SZeK5TWMrJFxDX.wotphlvK9sPbXJ(cursorB1EoSIRjJHO5.getInt(5)), cursorB1EoSIRjJHO5.getInt(6) != 0, cursorB1EoSIRjJHO5.getInt(7) != 0, cursorB1EoSIRjJHO5.getInt(8) != 0, cursorB1EoSIRjJHO5.getInt(9) != 0, cursorB1EoSIRjJHO5.getLong(10), cursorB1EoSIRjJHO5.getLong(11), jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF(cursorB1EoSIRjJHO5.isNull(12) ? null : cursorB1EoSIRjJHO5.getBlob(12)));
                    ArrayList arrayList2 = (ArrayList) map.get(cursorB1EoSIRjJHO5.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = (ArrayList) map2.get(cursorB1EoSIRjJHO5.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList.add(new Wj3khqO0IV5spCRYjim(string3, iNQilHWaqS401ZtR, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM, j2, j3, j4, rdWywP7AQUqPn0G, i3, iGIIiyi2ddlMDR0, j5, j6, i5, i4, j7, i6, arrayList2, arrayList3));
                }
                workDatabase_Impl.wotphlvK9sPbXJ();
                cursorB1EoSIRjJHO5.close();
                ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                workDatabase_Impl.D5P1xCAyuvgF();
                sFdNPiaH9eT4T.dTS0S7eC32ubQH54j36.getClass();
                ArrayList arrayList4 = new ArrayList(D8f4u3NB1PCAS427.xfn2GJwmGqs7kWW(arrayList));
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    int i8 = i7 + 1;
                    Wj3khqO0IV5spCRYjim wj3khqO0IV5spCRYjim = (Wj3khqO0IV5spCRYjim) obj;
                    ArrayList arrayList5 = wj3khqO0IV5spCRYjim.J0zjQ7CAgohuxU20eCW6;
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT = !arrayList5.isEmpty() ? (MnLRqMow83uotly4qYT) arrayList5.get(i) : MnLRqMow83uotly4qYT.w9sT1Swbhx3hs;
                    UUID uuidFromString = UUID.fromString(wj3khqO0IV5spCRYjim.dDIMxZXP1V8HdM);
                    int i9 = wj3khqO0IV5spCRYjim.w9sT1Swbhx3hs;
                    HashSet hashSet = new HashSet(wj3khqO0IV5spCRYjim.nQilHWaqS401ZtR);
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT2 = wj3khqO0IV5spCRYjim.vekpFI4d1Nc4fakF;
                    int i10 = wj3khqO0IV5spCRYjim.b1EoSIRjJHO5;
                    int i11 = wj3khqO0IV5spCRYjim.gIIiyi2ddlMDR0;
                    RdWywP7AQUqPn0G rdWywP7AQUqPn0G2 = wj3khqO0IV5spCRYjim.ibVTtJUNfrGYbW;
                    long j8 = wj3khqO0IV5spCRYjim.JXn4Qf7zpnLjP5;
                    ArrayList arrayList6 = arrayList;
                    long j9 = wj3khqO0IV5spCRYjim.Ee8d2j4S9Vm5yGuR;
                    mQBQwGexGlILozVBD mqbqwgexglilozvbd = j9 != 0 ? new mQBQwGexGlILozVBD(j9, wj3khqO0IV5spCRYjim.xDyLpEZyrcKVe0) : null;
                    int i12 = wj3khqO0IV5spCRYjim.w9sT1Swbhx3hs;
                    if (i12 == 1) {
                        UeVBYgBvSKYfVuXLhMs ueVBYgBvSKYfVuXLhMs = sFdNPiaH9eT4T.dTS0S7eC32ubQH54j36;
                        jW9sT1Swbhx3hs = gA5gCwTK0qjTIn.w9sT1Swbhx3hs(i12 == 1 && i10 > 0, i10, wj3khqO0IV5spCRYjim.pyu8ovAipBTLYAiKab, wj3khqO0IV5spCRYjim.D5P1xCAyuvgF, wj3khqO0IV5spCRYjim.hjneShqpF9Tis4, wj3khqO0IV5spCRYjim.gmNWMfvn6zlEj, j9 != 0, j8, wj3khqO0IV5spCRYjim.xDyLpEZyrcKVe0, j9, wj3khqO0IV5spCRYjim.wotphlvK9sPbXJ);
                        i2 = i10;
                        j = j8;
                    } else {
                        i2 = i10;
                        j = j8;
                        jW9sT1Swbhx3hs = Long.MAX_VALUE;
                    }
                    arrayList4.add(new lIUPb65VNgkY(uuidFromString, i9, hashSet, mnLRqMow83uotly4qYT2, mnLRqMow83uotly4qYT, i2, i11, rdWywP7AQUqPn0G2, j, mqbqwgexglilozvbd, jW9sT1Swbhx3hs, wj3khqO0IV5spCRYjim.Qrz92kRPw4GcghAc));
                    arrayList = arrayList6;
                    size = size;
                    i7 = i8;
                    i = 0;
                }
                return arrayList4;
            } catch (Throwable th) {
                cursorB1EoSIRjJHO5.close();
                ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.D5P1xCAyuvgF();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w9sT1Swbhx3hs;
        Object obj = this.Ee8d2j4S9Vm5yGuR;
        Object obj2 = this.JXn4Qf7zpnLjP5;
        Object obj3 = this.vekpFI4d1Nc4fakF;
        switch (i) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj;
                Context context = (Context) obj2;
                Intent intent = (Intent) obj3;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    int i2 = ConstraintProxyUpdateReceiver.dDIMxZXP1V8HdM;
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
                    ppGAzznNjZ5j6h.dDIMxZXP1V8HdM(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    ppGAzznNjZ5j6h.dDIMxZXP1V8HdM(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    ppGAzznNjZ5j6h.dDIMxZXP1V8HdM(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    ppGAzznNjZ5j6h.dDIMxZXP1V8HdM(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                ((DP5sXJhndWh8c4VkCzdA) obj3).b1EoSIRjJHO5((r9c8qUHbkyLZi) obj2, (W6dfON4KdcdxlH) obj);
                return;
            case 2:
                Af6wX3D8R2iFhqxr af6wX3D8R2iFhqxr = (Af6wX3D8R2iFhqxr) obj3;
                try {
                    af6wX3D8R2iFhqxr.pyu8ovAipBTLYAiKab(dDIMxZXP1V8HdM());
                    return;
                } catch (Throwable th) {
                    af6wX3D8R2iFhqxr.D5P1xCAyuvgF(th);
                    return;
                }
            default:
                SyncQYAdapter.Q7qC5ia93qGCjkBXCF0A(obj3, (RsA5TguOLrFfTXOtR) obj2, (ax0gnbsXD3up2) obj, null);
                return;
        }
    }

    public qjpsB7oD4nN4npCMR4XF(bIQtXpTQsEoGIf25Z biqtxptqseogif25z, String str) {
        this.w9sT1Swbhx3hs = 2;
        this.JXn4Qf7zpnLjP5 = biqtxptqseogif25z;
        this.Ee8d2j4S9Vm5yGuR = str;
        this.vekpFI4d1Nc4fakF = new Af6wX3D8R2iFhqxr();
    }
}
