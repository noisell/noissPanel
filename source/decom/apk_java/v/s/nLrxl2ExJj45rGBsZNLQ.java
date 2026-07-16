package v.s;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class nLrxl2ExJj45rGBsZNLQ {
    public final wrjXKFWxtWGPk22 D5P1xCAyuvgF;
    public final wrjXKFWxtWGPk22 Ee8d2j4S9Vm5yGuR;
    public final wrjXKFWxtWGPk22 JXn4Qf7zpnLjP5;
    public final wrjXKFWxtWGPk22 Qrz92kRPw4GcghAc;
    public final wrjXKFWxtWGPk22 b1EoSIRjJHO5;
    public final WorkDatabase_Impl dDIMxZXP1V8HdM;
    public final wrjXKFWxtWGPk22 gIIiyi2ddlMDR0;
    public final wrjXKFWxtWGPk22 gmNWMfvn6zlEj;
    public final wrjXKFWxtWGPk22 hjneShqpF9Tis4;
    public final wrjXKFWxtWGPk22 ibVTtJUNfrGYbW;
    public final wrjXKFWxtWGPk22 pyu8ovAipBTLYAiKab;
    public final wrjXKFWxtWGPk22 vekpFI4d1Nc4fakF;
    public final LeKZUBhDBK6LgUr w9sT1Swbhx3hs;
    public final wrjXKFWxtWGPk22 wotphlvK9sPbXJ;
    public final wrjXKFWxtWGPk22 xDyLpEZyrcKVe0;

    public nLrxl2ExJj45rGBsZNLQ(WorkDatabase_Impl workDatabase_Impl) {
        this.dDIMxZXP1V8HdM = workDatabase_Impl;
        this.w9sT1Swbhx3hs = new LeKZUBhDBK6LgUr(workDatabase_Impl, 5);
        this.vekpFI4d1Nc4fakF = new wrjXKFWxtWGPk22(workDatabase_Impl, 12);
        this.JXn4Qf7zpnLjP5 = new wrjXKFWxtWGPk22(workDatabase_Impl, 13);
        this.Ee8d2j4S9Vm5yGuR = new wrjXKFWxtWGPk22(workDatabase_Impl, 14);
        this.xDyLpEZyrcKVe0 = new wrjXKFWxtWGPk22(workDatabase_Impl, 15);
        this.ibVTtJUNfrGYbW = new wrjXKFWxtWGPk22(workDatabase_Impl, 16);
        this.b1EoSIRjJHO5 = new wrjXKFWxtWGPk22(workDatabase_Impl, 17);
        this.pyu8ovAipBTLYAiKab = new wrjXKFWxtWGPk22(workDatabase_Impl, 18);
        this.D5P1xCAyuvgF = new wrjXKFWxtWGPk22(workDatabase_Impl, 19);
        this.hjneShqpF9Tis4 = new wrjXKFWxtWGPk22(workDatabase_Impl, 4);
        new wrjXKFWxtWGPk22(workDatabase_Impl, 5);
        this.gmNWMfvn6zlEj = new wrjXKFWxtWGPk22(workDatabase_Impl, 6);
        this.gIIiyi2ddlMDR0 = new wrjXKFWxtWGPk22(workDatabase_Impl, 7);
        this.wotphlvK9sPbXJ = new wrjXKFWxtWGPk22(workDatabase_Impl, 8);
        new wrjXKFWxtWGPk22(workDatabase_Impl, 9);
        new wrjXKFWxtWGPk22(workDatabase_Impl, 10);
        this.Qrz92kRPw4GcghAc = new wrjXKFWxtWGPk22(workDatabase_Impl, 11);
    }

    public final int D5P1xCAyuvgF(String str) {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
        } else {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iNQilHWaqS401ZtR = 0;
            if (cursorGmNWMfvn6zlEj.moveToFirst()) {
                Integer numValueOf = cursorGmNWMfvn6zlEj.isNull(0) ? null : Integer.valueOf(cursorGmNWMfvn6zlEj.getInt(0));
                if (numValueOf != null) {
                    iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(numValueOf.intValue());
                }
            }
            return iNQilHWaqS401ZtR;
        } finally {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
        }
    }

    public final ArrayList Ee8d2j4S9Vm5yGuR() {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
            while (cursorGmNWMfvn6zlEj.moveToNext()) {
                arrayList.add(cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getString(0));
            }
            return arrayList;
        } finally {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
        }
    }

    public final void J0zjQ7CAgohuxU20eCW6(String str, MnLRqMow83uotly4qYT mnLRqMow83uotly4qYT) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = this.b1EoSIRjJHO5;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        byte[] bArrW9sT1Swbhx3hs = MnLRqMow83uotly4qYT.w9sT1Swbhx3hs(mnLRqMow83uotly4qYT);
        if (bArrW9sT1Swbhx3hs == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(1);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dTS0S7eC32ubQH54j36(bArrW9sT1Swbhx3hs, 1);
        }
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(2);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 2);
        }
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    public final ArrayList JXn4Qf7zpnLjP5() throws Throwable {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        ez6sozeos7kkqzccqforD5P1xCAyuvgF.wotphlvK9sPbXJ(1, 146 + 54);
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iJ0zjQ7CAgohuxU20eCW6 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "id");
            int iJ0zjQ7CAgohuxU20eCW7 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "state");
            int iJ0zjQ7CAgohuxU20eCW8 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "worker_class_name");
            int iJ0zjQ7CAgohuxU20eCW9 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input_merger_class_name");
            int iJ0zjQ7CAgohuxU20eCW10 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input");
            int iJ0zjQ7CAgohuxU20eCW11 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "output");
            int iJ0zjQ7CAgohuxU20eCW12 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "initial_delay");
            int iJ0zjQ7CAgohuxU20eCW13 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "interval_duration");
            int iJ0zjQ7CAgohuxU20eCW14 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "flex_duration");
            int iJ0zjQ7CAgohuxU20eCW15 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_attempt_count");
            int iJ0zjQ7CAgohuxU20eCW16 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_policy");
            int iJ0zjQ7CAgohuxU20eCW17 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_delay_duration");
            int iJ0zjQ7CAgohuxU20eCW18 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "last_enqueue_time");
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
            try {
                int iJ0zjQ7CAgohuxU20eCW19 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "minimum_retention_duration");
                int iJ0zjQ7CAgohuxU20eCW20 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "schedule_requested_at");
                int iJ0zjQ7CAgohuxU20eCW21 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_in_foreground");
                int iJ0zjQ7CAgohuxU20eCW22 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "out_of_quota_policy");
                int iJ0zjQ7CAgohuxU20eCW23 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "period_count");
                int iJ0zjQ7CAgohuxU20eCW24 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "generation");
                int iJ0zjQ7CAgohuxU20eCW25 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override");
                int iJ0zjQ7CAgohuxU20eCW26 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override_generation");
                int iJ0zjQ7CAgohuxU20eCW27 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "stop_reason");
                int iJ0zjQ7CAgohuxU20eCW28 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "required_network_type");
                int iJ0zjQ7CAgohuxU20eCW29 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_charging");
                int iJ0zjQ7CAgohuxU20eCW30 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_device_idle");
                int iJ0zjQ7CAgohuxU20eCW31 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_battery_not_low");
                int iJ0zjQ7CAgohuxU20eCW32 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_storage_not_low");
                int iJ0zjQ7CAgohuxU20eCW33 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_content_update_delay");
                int iJ0zjQ7CAgohuxU20eCW34 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_max_content_delay");
                int iJ0zjQ7CAgohuxU20eCW35 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "content_uri_triggers");
                int i = iJ0zjQ7CAgohuxU20eCW19;
                ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
                while (cursorGmNWMfvn6zlEj.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW6) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW6);
                    int iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW7));
                    String string2 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW8) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW8);
                    String string3 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW9) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW9);
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW10) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW10));
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2 = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW11) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW11));
                    long j = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW12);
                    long j2 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW13);
                    long j3 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW14);
                    int i2 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW15);
                    int iGIIiyi2ddlMDR0 = jb8et6SZeK5TWMrJFxDX.gIIiyi2ddlMDR0(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW16));
                    long j4 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW17);
                    long j5 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW18);
                    int i3 = i;
                    long j6 = cursorGmNWMfvn6zlEj.getLong(i3);
                    int i4 = iJ0zjQ7CAgohuxU20eCW6;
                    int i5 = iJ0zjQ7CAgohuxU20eCW20;
                    long j7 = cursorGmNWMfvn6zlEj.getLong(i5);
                    iJ0zjQ7CAgohuxU20eCW20 = i5;
                    int i6 = iJ0zjQ7CAgohuxU20eCW21;
                    boolean z = cursorGmNWMfvn6zlEj.getInt(i6) != 0;
                    iJ0zjQ7CAgohuxU20eCW21 = i6;
                    int i7 = iJ0zjQ7CAgohuxU20eCW22;
                    int iQrz92kRPw4GcghAc = jb8et6SZeK5TWMrJFxDX.Qrz92kRPw4GcghAc(cursorGmNWMfvn6zlEj.getInt(i7));
                    iJ0zjQ7CAgohuxU20eCW22 = i7;
                    int i8 = iJ0zjQ7CAgohuxU20eCW23;
                    int i9 = cursorGmNWMfvn6zlEj.getInt(i8);
                    iJ0zjQ7CAgohuxU20eCW23 = i8;
                    int i10 = iJ0zjQ7CAgohuxU20eCW24;
                    int i11 = cursorGmNWMfvn6zlEj.getInt(i10);
                    iJ0zjQ7CAgohuxU20eCW24 = i10;
                    int i12 = iJ0zjQ7CAgohuxU20eCW25;
                    long j8 = cursorGmNWMfvn6zlEj.getLong(i12);
                    iJ0zjQ7CAgohuxU20eCW25 = i12;
                    int i13 = iJ0zjQ7CAgohuxU20eCW26;
                    int i14 = cursorGmNWMfvn6zlEj.getInt(i13);
                    iJ0zjQ7CAgohuxU20eCW26 = i13;
                    int i15 = iJ0zjQ7CAgohuxU20eCW27;
                    int i16 = cursorGmNWMfvn6zlEj.getInt(i15);
                    iJ0zjQ7CAgohuxU20eCW27 = i15;
                    int i17 = iJ0zjQ7CAgohuxU20eCW28;
                    int iWotphlvK9sPbXJ = jb8et6SZeK5TWMrJFxDX.wotphlvK9sPbXJ(cursorGmNWMfvn6zlEj.getInt(i17));
                    iJ0zjQ7CAgohuxU20eCW28 = i17;
                    int i18 = iJ0zjQ7CAgohuxU20eCW29;
                    boolean z2 = cursorGmNWMfvn6zlEj.getInt(i18) != 0;
                    iJ0zjQ7CAgohuxU20eCW29 = i18;
                    int i19 = iJ0zjQ7CAgohuxU20eCW30;
                    boolean z3 = cursorGmNWMfvn6zlEj.getInt(i19) != 0;
                    iJ0zjQ7CAgohuxU20eCW30 = i19;
                    int i20 = iJ0zjQ7CAgohuxU20eCW31;
                    boolean z4 = cursorGmNWMfvn6zlEj.getInt(i20) != 0;
                    iJ0zjQ7CAgohuxU20eCW31 = i20;
                    int i21 = iJ0zjQ7CAgohuxU20eCW32;
                    boolean z5 = cursorGmNWMfvn6zlEj.getInt(i21) != 0;
                    iJ0zjQ7CAgohuxU20eCW32 = i21;
                    int i22 = iJ0zjQ7CAgohuxU20eCW33;
                    long j9 = cursorGmNWMfvn6zlEj.getLong(i22);
                    iJ0zjQ7CAgohuxU20eCW33 = i22;
                    int i23 = iJ0zjQ7CAgohuxU20eCW34;
                    long j10 = cursorGmNWMfvn6zlEj.getLong(i23);
                    iJ0zjQ7CAgohuxU20eCW34 = i23;
                    int i24 = iJ0zjQ7CAgohuxU20eCW35;
                    if (!cursorGmNWMfvn6zlEj.isNull(i24)) {
                        blob = cursorGmNWMfvn6zlEj.getBlob(i24);
                    }
                    iJ0zjQ7CAgohuxU20eCW35 = i24;
                    arrayList.add(new sFdNPiaH9eT4T(string, iNQilHWaqS401ZtR, string2, string3, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2, j, j2, j3, new RdWywP7AQUqPn0G(iWotphlvK9sPbXJ, z2, z3, z4, z5, j9, j10, jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF(blob)), i2, iGIIiyi2ddlMDR0, j4, j5, j6, j7, z, iQrz92kRPw4GcghAc, i9, i11, j8, i14, i16));
                    iJ0zjQ7CAgohuxU20eCW6 = i4;
                    i = i3;
                }
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
        }
    }

    public final void MLSIo1htfMPWeB8V876L(String str, int i) {
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = this.Ee8d2j4S9Vm5yGuR;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.wotphlvK9sPbXJ(1, jb8et6SZeK5TWMrJFxDX.l1V0lQr6TbwNKqHfXNbb(i));
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(2);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 2);
        }
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    public final void Qrz92kRPw4GcghAc(String str, int i) {
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = this.gmNWMfvn6zlEj;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(1);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 1);
        }
        ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.wotphlvK9sPbXJ(2, i);
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    public final void XiR1pIn5878vVWd(String str, int i) {
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = this.Qrz92kRPw4GcghAc;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.wotphlvK9sPbXJ(1, i);
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(2);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 2);
        }
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    public final ArrayList b1EoSIRjJHO5() throws Throwable {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT * FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iJ0zjQ7CAgohuxU20eCW6 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "id");
            int iJ0zjQ7CAgohuxU20eCW7 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "state");
            int iJ0zjQ7CAgohuxU20eCW8 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "worker_class_name");
            int iJ0zjQ7CAgohuxU20eCW9 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input_merger_class_name");
            int iJ0zjQ7CAgohuxU20eCW10 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input");
            int iJ0zjQ7CAgohuxU20eCW11 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "output");
            int iJ0zjQ7CAgohuxU20eCW12 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "initial_delay");
            int iJ0zjQ7CAgohuxU20eCW13 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "interval_duration");
            int iJ0zjQ7CAgohuxU20eCW14 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "flex_duration");
            int iJ0zjQ7CAgohuxU20eCW15 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_attempt_count");
            int iJ0zjQ7CAgohuxU20eCW16 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_policy");
            int iJ0zjQ7CAgohuxU20eCW17 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_delay_duration");
            int iJ0zjQ7CAgohuxU20eCW18 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "last_enqueue_time");
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
            try {
                int iJ0zjQ7CAgohuxU20eCW19 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "minimum_retention_duration");
                int iJ0zjQ7CAgohuxU20eCW20 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "schedule_requested_at");
                int iJ0zjQ7CAgohuxU20eCW21 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_in_foreground");
                int iJ0zjQ7CAgohuxU20eCW22 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "out_of_quota_policy");
                int iJ0zjQ7CAgohuxU20eCW23 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "period_count");
                int iJ0zjQ7CAgohuxU20eCW24 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "generation");
                int iJ0zjQ7CAgohuxU20eCW25 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override");
                int iJ0zjQ7CAgohuxU20eCW26 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override_generation");
                int iJ0zjQ7CAgohuxU20eCW27 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "stop_reason");
                int iJ0zjQ7CAgohuxU20eCW28 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "required_network_type");
                int iJ0zjQ7CAgohuxU20eCW29 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_charging");
                int iJ0zjQ7CAgohuxU20eCW30 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_device_idle");
                int iJ0zjQ7CAgohuxU20eCW31 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_battery_not_low");
                int iJ0zjQ7CAgohuxU20eCW32 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_storage_not_low");
                int iJ0zjQ7CAgohuxU20eCW33 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_content_update_delay");
                int iJ0zjQ7CAgohuxU20eCW34 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_max_content_delay");
                int iJ0zjQ7CAgohuxU20eCW35 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "content_uri_triggers");
                int i = iJ0zjQ7CAgohuxU20eCW19;
                ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
                while (cursorGmNWMfvn6zlEj.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW6) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW6);
                    int iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW7));
                    String string2 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW8) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW8);
                    String string3 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW9) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW9);
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW10) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW10));
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2 = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW11) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW11));
                    long j = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW12);
                    long j2 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW13);
                    long j3 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW14);
                    int i2 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW15);
                    int iGIIiyi2ddlMDR0 = jb8et6SZeK5TWMrJFxDX.gIIiyi2ddlMDR0(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW16));
                    long j4 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW17);
                    long j5 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW18);
                    int i3 = i;
                    long j6 = cursorGmNWMfvn6zlEj.getLong(i3);
                    int i4 = iJ0zjQ7CAgohuxU20eCW6;
                    int i5 = iJ0zjQ7CAgohuxU20eCW20;
                    long j7 = cursorGmNWMfvn6zlEj.getLong(i5);
                    iJ0zjQ7CAgohuxU20eCW20 = i5;
                    int i6 = iJ0zjQ7CAgohuxU20eCW21;
                    boolean z = cursorGmNWMfvn6zlEj.getInt(i6) != 0;
                    iJ0zjQ7CAgohuxU20eCW21 = i6;
                    int i7 = iJ0zjQ7CAgohuxU20eCW22;
                    int iQrz92kRPw4GcghAc = jb8et6SZeK5TWMrJFxDX.Qrz92kRPw4GcghAc(cursorGmNWMfvn6zlEj.getInt(i7));
                    iJ0zjQ7CAgohuxU20eCW22 = i7;
                    int i8 = iJ0zjQ7CAgohuxU20eCW23;
                    int i9 = cursorGmNWMfvn6zlEj.getInt(i8);
                    iJ0zjQ7CAgohuxU20eCW23 = i8;
                    int i10 = iJ0zjQ7CAgohuxU20eCW24;
                    int i11 = cursorGmNWMfvn6zlEj.getInt(i10);
                    iJ0zjQ7CAgohuxU20eCW24 = i10;
                    int i12 = iJ0zjQ7CAgohuxU20eCW25;
                    long j8 = cursorGmNWMfvn6zlEj.getLong(i12);
                    iJ0zjQ7CAgohuxU20eCW25 = i12;
                    int i13 = iJ0zjQ7CAgohuxU20eCW26;
                    int i14 = cursorGmNWMfvn6zlEj.getInt(i13);
                    iJ0zjQ7CAgohuxU20eCW26 = i13;
                    int i15 = iJ0zjQ7CAgohuxU20eCW27;
                    int i16 = cursorGmNWMfvn6zlEj.getInt(i15);
                    iJ0zjQ7CAgohuxU20eCW27 = i15;
                    int i17 = iJ0zjQ7CAgohuxU20eCW28;
                    int iWotphlvK9sPbXJ = jb8et6SZeK5TWMrJFxDX.wotphlvK9sPbXJ(cursorGmNWMfvn6zlEj.getInt(i17));
                    iJ0zjQ7CAgohuxU20eCW28 = i17;
                    int i18 = iJ0zjQ7CAgohuxU20eCW29;
                    boolean z2 = cursorGmNWMfvn6zlEj.getInt(i18) != 0;
                    iJ0zjQ7CAgohuxU20eCW29 = i18;
                    int i19 = iJ0zjQ7CAgohuxU20eCW30;
                    boolean z3 = cursorGmNWMfvn6zlEj.getInt(i19) != 0;
                    iJ0zjQ7CAgohuxU20eCW30 = i19;
                    int i20 = iJ0zjQ7CAgohuxU20eCW31;
                    boolean z4 = cursorGmNWMfvn6zlEj.getInt(i20) != 0;
                    iJ0zjQ7CAgohuxU20eCW31 = i20;
                    int i21 = iJ0zjQ7CAgohuxU20eCW32;
                    boolean z5 = cursorGmNWMfvn6zlEj.getInt(i21) != 0;
                    iJ0zjQ7CAgohuxU20eCW32 = i21;
                    int i22 = iJ0zjQ7CAgohuxU20eCW33;
                    long j9 = cursorGmNWMfvn6zlEj.getLong(i22);
                    iJ0zjQ7CAgohuxU20eCW33 = i22;
                    int i23 = iJ0zjQ7CAgohuxU20eCW34;
                    long j10 = cursorGmNWMfvn6zlEj.getLong(i23);
                    iJ0zjQ7CAgohuxU20eCW34 = i23;
                    int i24 = iJ0zjQ7CAgohuxU20eCW35;
                    if (!cursorGmNWMfvn6zlEj.isNull(i24)) {
                        blob = cursorGmNWMfvn6zlEj.getBlob(i24);
                    }
                    iJ0zjQ7CAgohuxU20eCW35 = i24;
                    arrayList.add(new sFdNPiaH9eT4T(string, iNQilHWaqS401ZtR, string2, string3, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2, j, j2, j3, new RdWywP7AQUqPn0G(iWotphlvK9sPbXJ, z2, z3, z4, z5, j9, j10, jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF(blob)), i2, iGIIiyi2ddlMDR0, j4, j5, j6, j7, z, iQrz92kRPw4GcghAc, i9, i11, j8, i14, i16));
                    iJ0zjQ7CAgohuxU20eCW6 = i4;
                    i = i3;
                }
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
        }
    }

    public final void dDIMxZXP1V8HdM(HashMap map) {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            Iterator it = setKeySet.iterator();
            loop0: while (true) {
                i = 0;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String str = (String) it.next();
                    map2.put(str, (ArrayList) map.get(str));
                    i++;
                } while (i != 999);
                dDIMxZXP1V8HdM(map2);
                map2 = new HashMap(999);
            }
            if (i > 0) {
                dDIMxZXP1V8HdM(map2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append("?");
            if (i2 < size - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF(sb.toString(), size);
        int i3 = 99 - 98;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(i3);
            } else {
                ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str2, i3);
            }
            i3++;
        }
        Cursor cursorGmNWMfvn6zlEj = this.dDIMxZXP1V8HdM.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iNQilHWaqS401ZtR = SbxdZ6Kq2uhHQ5RPRqm.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj, "work_spec_id");
            if (iNQilHWaqS401ZtR == -1) {
                return;
            }
            while (cursorGmNWMfvn6zlEj.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorGmNWMfvn6zlEj.getString(iNQilHWaqS401ZtR));
                if (arrayList != null) {
                    arrayList.add(MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getBlob(0)));
                }
            }
        } finally {
            cursorGmNWMfvn6zlEj.close();
        }
    }

    public final ArrayList gIIiyi2ddlMDR0(String str) {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
        } else {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
            while (cursorGmNWMfvn6zlEj.moveToNext()) {
                String string = cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getString(0);
                int iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj.getInt(1));
                Xc1FQ2gtMD4wYN6jPv xc1FQ2gtMD4wYN6jPv = new Xc1FQ2gtMD4wYN6jPv();
                xc1FQ2gtMD4wYN6jPv.dDIMxZXP1V8HdM = string;
                xc1FQ2gtMD4wYN6jPv.w9sT1Swbhx3hs = iNQilHWaqS401ZtR;
                arrayList.add(xc1FQ2gtMD4wYN6jPv);
            }
            return arrayList;
        } finally {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
        }
    }

    public final sFdNPiaH9eT4T gmNWMfvn6zlEj(String str) {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
        } else {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iJ0zjQ7CAgohuxU20eCW6 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "id");
            int iJ0zjQ7CAgohuxU20eCW7 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "state");
            int iJ0zjQ7CAgohuxU20eCW8 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "worker_class_name");
            int iJ0zjQ7CAgohuxU20eCW9 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input_merger_class_name");
            int iJ0zjQ7CAgohuxU20eCW10 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input");
            int iJ0zjQ7CAgohuxU20eCW11 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "output");
            int iJ0zjQ7CAgohuxU20eCW12 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "initial_delay");
            int iJ0zjQ7CAgohuxU20eCW13 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "interval_duration");
            int iJ0zjQ7CAgohuxU20eCW14 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "flex_duration");
            int iJ0zjQ7CAgohuxU20eCW15 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_attempt_count");
            int iJ0zjQ7CAgohuxU20eCW16 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_policy");
            int iJ0zjQ7CAgohuxU20eCW17 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_delay_duration");
            int iJ0zjQ7CAgohuxU20eCW18 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "last_enqueue_time");
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
            try {
                int iJ0zjQ7CAgohuxU20eCW19 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "minimum_retention_duration");
                int iJ0zjQ7CAgohuxU20eCW20 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "schedule_requested_at");
                int iJ0zjQ7CAgohuxU20eCW21 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_in_foreground");
                int iJ0zjQ7CAgohuxU20eCW22 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "out_of_quota_policy");
                int iJ0zjQ7CAgohuxU20eCW23 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "period_count");
                int iJ0zjQ7CAgohuxU20eCW24 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "generation");
                int iJ0zjQ7CAgohuxU20eCW25 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override");
                int iJ0zjQ7CAgohuxU20eCW26 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override_generation");
                int iJ0zjQ7CAgohuxU20eCW27 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "stop_reason");
                int iJ0zjQ7CAgohuxU20eCW28 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "required_network_type");
                int iJ0zjQ7CAgohuxU20eCW29 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_charging");
                int iJ0zjQ7CAgohuxU20eCW30 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_device_idle");
                int iJ0zjQ7CAgohuxU20eCW31 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_battery_not_low");
                int iJ0zjQ7CAgohuxU20eCW32 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_storage_not_low");
                int iJ0zjQ7CAgohuxU20eCW33 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_content_update_delay");
                int iJ0zjQ7CAgohuxU20eCW34 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_max_content_delay");
                int iJ0zjQ7CAgohuxU20eCW35 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "content_uri_triggers");
                sFdNPiaH9eT4T sfdnpiah9et4t = null;
                byte[] blob = null;
                if (cursorGmNWMfvn6zlEj.moveToFirst()) {
                    String string = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW6) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW6);
                    int iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW7));
                    String string2 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW8) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW8);
                    String string3 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW9) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW9);
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW10) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW10));
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2 = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW11) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW11));
                    long j = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW12);
                    long j2 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW13);
                    long j3 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW14);
                    int i = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW15);
                    int iGIIiyi2ddlMDR0 = jb8et6SZeK5TWMrJFxDX.gIIiyi2ddlMDR0(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW16));
                    long j4 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW17);
                    long j5 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW18);
                    long j6 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW19);
                    long j7 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW20);
                    boolean z = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW21) != 0;
                    int iQrz92kRPw4GcghAc = jb8et6SZeK5TWMrJFxDX.Qrz92kRPw4GcghAc(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW22));
                    int i2 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW23);
                    int i3 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW24);
                    long j8 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW25);
                    int i4 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW26);
                    int i5 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW27);
                    int iWotphlvK9sPbXJ = jb8et6SZeK5TWMrJFxDX.wotphlvK9sPbXJ(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW28));
                    boolean z2 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW29) != 0;
                    boolean z3 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW30) != 0;
                    boolean z4 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW31) != 0;
                    boolean z5 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW32) != 0;
                    long j9 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW33);
                    long j10 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW34);
                    if (!cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW35)) {
                        blob = cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW35);
                    }
                    sfdnpiah9et4t = new sFdNPiaH9eT4T(string, iNQilHWaqS401ZtR, string2, string3, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2, j, j2, j3, new RdWywP7AQUqPn0G(iWotphlvK9sPbXJ, z2, z3, z4, z5, j9, j10, jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF(blob)), i, iGIIiyi2ddlMDR0, j4, j5, j6, j7, z, iQrz92kRPw4GcghAc, i2, i3, j8, i4, i5);
                }
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                return sfdnpiah9et4t;
            } catch (Throwable th) {
                th = th;
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
        }
    }

    public final ArrayList hjneShqpF9Tis4(String str) {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
        } else {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
            while (cursorGmNWMfvn6zlEj.moveToNext()) {
                arrayList.add(cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getString(0));
            }
            return arrayList;
        } finally {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
        }
    }

    public final ArrayList ibVTtJUNfrGYbW() throws Throwable {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iJ0zjQ7CAgohuxU20eCW6 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "id");
            int iJ0zjQ7CAgohuxU20eCW7 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "state");
            int iJ0zjQ7CAgohuxU20eCW8 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "worker_class_name");
            int iJ0zjQ7CAgohuxU20eCW9 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input_merger_class_name");
            int iJ0zjQ7CAgohuxU20eCW10 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input");
            int iJ0zjQ7CAgohuxU20eCW11 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "output");
            int iJ0zjQ7CAgohuxU20eCW12 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "initial_delay");
            int iJ0zjQ7CAgohuxU20eCW13 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "interval_duration");
            int iJ0zjQ7CAgohuxU20eCW14 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "flex_duration");
            int iJ0zjQ7CAgohuxU20eCW15 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_attempt_count");
            int iJ0zjQ7CAgohuxU20eCW16 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_policy");
            int iJ0zjQ7CAgohuxU20eCW17 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_delay_duration");
            int iJ0zjQ7CAgohuxU20eCW18 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "last_enqueue_time");
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
            try {
                int iJ0zjQ7CAgohuxU20eCW19 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "minimum_retention_duration");
                int iJ0zjQ7CAgohuxU20eCW20 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "schedule_requested_at");
                int iJ0zjQ7CAgohuxU20eCW21 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_in_foreground");
                int iJ0zjQ7CAgohuxU20eCW22 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "out_of_quota_policy");
                int iJ0zjQ7CAgohuxU20eCW23 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "period_count");
                int iJ0zjQ7CAgohuxU20eCW24 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "generation");
                int iJ0zjQ7CAgohuxU20eCW25 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override");
                int iJ0zjQ7CAgohuxU20eCW26 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override_generation");
                int iJ0zjQ7CAgohuxU20eCW27 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "stop_reason");
                int iJ0zjQ7CAgohuxU20eCW28 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "required_network_type");
                int iJ0zjQ7CAgohuxU20eCW29 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_charging");
                int iJ0zjQ7CAgohuxU20eCW30 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_device_idle");
                int iJ0zjQ7CAgohuxU20eCW31 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_battery_not_low");
                int iJ0zjQ7CAgohuxU20eCW32 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_storage_not_low");
                int iJ0zjQ7CAgohuxU20eCW33 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_content_update_delay");
                int iJ0zjQ7CAgohuxU20eCW34 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_max_content_delay");
                int iJ0zjQ7CAgohuxU20eCW35 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "content_uri_triggers");
                int i = iJ0zjQ7CAgohuxU20eCW19;
                ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
                while (cursorGmNWMfvn6zlEj.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW6) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW6);
                    int iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW7));
                    String string2 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW8) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW8);
                    String string3 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW9) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW9);
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW10) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW10));
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2 = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW11) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW11));
                    long j = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW12);
                    long j2 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW13);
                    long j3 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW14);
                    int i2 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW15);
                    int iGIIiyi2ddlMDR0 = jb8et6SZeK5TWMrJFxDX.gIIiyi2ddlMDR0(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW16));
                    long j4 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW17);
                    long j5 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW18);
                    int i3 = i;
                    long j6 = cursorGmNWMfvn6zlEj.getLong(i3);
                    int i4 = iJ0zjQ7CAgohuxU20eCW6;
                    int i5 = iJ0zjQ7CAgohuxU20eCW20;
                    long j7 = cursorGmNWMfvn6zlEj.getLong(i5);
                    iJ0zjQ7CAgohuxU20eCW20 = i5;
                    int i6 = iJ0zjQ7CAgohuxU20eCW21;
                    boolean z = cursorGmNWMfvn6zlEj.getInt(i6) != 0;
                    iJ0zjQ7CAgohuxU20eCW21 = i6;
                    int i7 = iJ0zjQ7CAgohuxU20eCW22;
                    int iQrz92kRPw4GcghAc = jb8et6SZeK5TWMrJFxDX.Qrz92kRPw4GcghAc(cursorGmNWMfvn6zlEj.getInt(i7));
                    iJ0zjQ7CAgohuxU20eCW22 = i7;
                    int i8 = iJ0zjQ7CAgohuxU20eCW23;
                    int i9 = cursorGmNWMfvn6zlEj.getInt(i8);
                    iJ0zjQ7CAgohuxU20eCW23 = i8;
                    int i10 = iJ0zjQ7CAgohuxU20eCW24;
                    int i11 = cursorGmNWMfvn6zlEj.getInt(i10);
                    iJ0zjQ7CAgohuxU20eCW24 = i10;
                    int i12 = iJ0zjQ7CAgohuxU20eCW25;
                    long j8 = cursorGmNWMfvn6zlEj.getLong(i12);
                    iJ0zjQ7CAgohuxU20eCW25 = i12;
                    int i13 = iJ0zjQ7CAgohuxU20eCW26;
                    int i14 = cursorGmNWMfvn6zlEj.getInt(i13);
                    iJ0zjQ7CAgohuxU20eCW26 = i13;
                    int i15 = iJ0zjQ7CAgohuxU20eCW27;
                    int i16 = cursorGmNWMfvn6zlEj.getInt(i15);
                    iJ0zjQ7CAgohuxU20eCW27 = i15;
                    int i17 = iJ0zjQ7CAgohuxU20eCW28;
                    int iWotphlvK9sPbXJ = jb8et6SZeK5TWMrJFxDX.wotphlvK9sPbXJ(cursorGmNWMfvn6zlEj.getInt(i17));
                    iJ0zjQ7CAgohuxU20eCW28 = i17;
                    int i18 = iJ0zjQ7CAgohuxU20eCW29;
                    boolean z2 = cursorGmNWMfvn6zlEj.getInt(i18) != 0;
                    iJ0zjQ7CAgohuxU20eCW29 = i18;
                    int i19 = iJ0zjQ7CAgohuxU20eCW30;
                    boolean z3 = cursorGmNWMfvn6zlEj.getInt(i19) != 0;
                    iJ0zjQ7CAgohuxU20eCW30 = i19;
                    int i20 = iJ0zjQ7CAgohuxU20eCW31;
                    boolean z4 = cursorGmNWMfvn6zlEj.getInt(i20) != 0;
                    iJ0zjQ7CAgohuxU20eCW31 = i20;
                    int i21 = iJ0zjQ7CAgohuxU20eCW32;
                    boolean z5 = cursorGmNWMfvn6zlEj.getInt(i21) != 0;
                    iJ0zjQ7CAgohuxU20eCW32 = i21;
                    int i22 = iJ0zjQ7CAgohuxU20eCW33;
                    long j9 = cursorGmNWMfvn6zlEj.getLong(i22);
                    iJ0zjQ7CAgohuxU20eCW33 = i22;
                    int i23 = iJ0zjQ7CAgohuxU20eCW34;
                    long j10 = cursorGmNWMfvn6zlEj.getLong(i23);
                    iJ0zjQ7CAgohuxU20eCW34 = i23;
                    int i24 = iJ0zjQ7CAgohuxU20eCW35;
                    if (!cursorGmNWMfvn6zlEj.isNull(i24)) {
                        blob = cursorGmNWMfvn6zlEj.getBlob(i24);
                    }
                    iJ0zjQ7CAgohuxU20eCW35 = i24;
                    arrayList.add(new sFdNPiaH9eT4T(string, iNQilHWaqS401ZtR, string2, string3, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2, j, j2, j3, new RdWywP7AQUqPn0G(iWotphlvK9sPbXJ, z2, z3, z4, z5, j9, j10, jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF(blob)), i2, iGIIiyi2ddlMDR0, j4, j5, j6, j7, z, iQrz92kRPw4GcghAc, i9, i11, j8, i14, i16));
                    iJ0zjQ7CAgohuxU20eCW6 = i4;
                    i = i3;
                }
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
        }
    }

    public final void nQilHWaqS401ZtR(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = this.pyu8ovAipBTLYAiKab;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.wotphlvK9sPbXJ(1, j);
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(2);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 2);
        }
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    public final ArrayList pyu8ovAipBTLYAiKab() {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iJ0zjQ7CAgohuxU20eCW6 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "id");
            int iJ0zjQ7CAgohuxU20eCW7 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "state");
            int iJ0zjQ7CAgohuxU20eCW8 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "worker_class_name");
            int iJ0zjQ7CAgohuxU20eCW9 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input_merger_class_name");
            int iJ0zjQ7CAgohuxU20eCW10 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input");
            int iJ0zjQ7CAgohuxU20eCW11 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "output");
            int iJ0zjQ7CAgohuxU20eCW12 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "initial_delay");
            int iJ0zjQ7CAgohuxU20eCW13 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "interval_duration");
            int iJ0zjQ7CAgohuxU20eCW14 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "flex_duration");
            int iJ0zjQ7CAgohuxU20eCW15 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_attempt_count");
            int iJ0zjQ7CAgohuxU20eCW16 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_policy");
            int iJ0zjQ7CAgohuxU20eCW17 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_delay_duration");
            int iJ0zjQ7CAgohuxU20eCW18 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "last_enqueue_time");
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
            try {
                int iJ0zjQ7CAgohuxU20eCW19 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "minimum_retention_duration");
                int iJ0zjQ7CAgohuxU20eCW20 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "schedule_requested_at");
                int iJ0zjQ7CAgohuxU20eCW21 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_in_foreground");
                int iJ0zjQ7CAgohuxU20eCW22 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "out_of_quota_policy");
                int iJ0zjQ7CAgohuxU20eCW23 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "period_count");
                int iJ0zjQ7CAgohuxU20eCW24 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "generation");
                int iJ0zjQ7CAgohuxU20eCW25 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override");
                int iJ0zjQ7CAgohuxU20eCW26 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override_generation");
                int iJ0zjQ7CAgohuxU20eCW27 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "stop_reason");
                int iJ0zjQ7CAgohuxU20eCW28 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "required_network_type");
                int iJ0zjQ7CAgohuxU20eCW29 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_charging");
                int iJ0zjQ7CAgohuxU20eCW30 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_device_idle");
                int iJ0zjQ7CAgohuxU20eCW31 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_battery_not_low");
                int iJ0zjQ7CAgohuxU20eCW32 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_storage_not_low");
                int iJ0zjQ7CAgohuxU20eCW33 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_content_update_delay");
                int iJ0zjQ7CAgohuxU20eCW34 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_max_content_delay");
                int iJ0zjQ7CAgohuxU20eCW35 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "content_uri_triggers");
                int i = iJ0zjQ7CAgohuxU20eCW19;
                ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
                while (cursorGmNWMfvn6zlEj.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW6) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW6);
                    int iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW7));
                    String string2 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW8) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW8);
                    String string3 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW9) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW9);
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW10) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW10));
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2 = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW11) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW11));
                    long j = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW12);
                    long j2 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW13);
                    long j3 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW14);
                    int i2 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW15);
                    int iGIIiyi2ddlMDR0 = jb8et6SZeK5TWMrJFxDX.gIIiyi2ddlMDR0(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW16));
                    long j4 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW17);
                    long j5 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW18);
                    int i3 = i;
                    long j6 = cursorGmNWMfvn6zlEj.getLong(i3);
                    int i4 = iJ0zjQ7CAgohuxU20eCW6;
                    int i5 = iJ0zjQ7CAgohuxU20eCW20;
                    long j7 = cursorGmNWMfvn6zlEj.getLong(i5);
                    iJ0zjQ7CAgohuxU20eCW20 = i5;
                    int i6 = iJ0zjQ7CAgohuxU20eCW21;
                    boolean z = cursorGmNWMfvn6zlEj.getInt(i6) != 0;
                    iJ0zjQ7CAgohuxU20eCW21 = i6;
                    int i7 = iJ0zjQ7CAgohuxU20eCW22;
                    int iQrz92kRPw4GcghAc = jb8et6SZeK5TWMrJFxDX.Qrz92kRPw4GcghAc(cursorGmNWMfvn6zlEj.getInt(i7));
                    iJ0zjQ7CAgohuxU20eCW22 = i7;
                    int i8 = iJ0zjQ7CAgohuxU20eCW23;
                    int i9 = cursorGmNWMfvn6zlEj.getInt(i8);
                    iJ0zjQ7CAgohuxU20eCW23 = i8;
                    int i10 = iJ0zjQ7CAgohuxU20eCW24;
                    int i11 = cursorGmNWMfvn6zlEj.getInt(i10);
                    iJ0zjQ7CAgohuxU20eCW24 = i10;
                    int i12 = iJ0zjQ7CAgohuxU20eCW25;
                    long j8 = cursorGmNWMfvn6zlEj.getLong(i12);
                    iJ0zjQ7CAgohuxU20eCW25 = i12;
                    int i13 = iJ0zjQ7CAgohuxU20eCW26;
                    int i14 = cursorGmNWMfvn6zlEj.getInt(i13);
                    iJ0zjQ7CAgohuxU20eCW26 = i13;
                    int i15 = iJ0zjQ7CAgohuxU20eCW27;
                    int i16 = cursorGmNWMfvn6zlEj.getInt(i15);
                    iJ0zjQ7CAgohuxU20eCW27 = i15;
                    int i17 = iJ0zjQ7CAgohuxU20eCW28;
                    int iWotphlvK9sPbXJ = jb8et6SZeK5TWMrJFxDX.wotphlvK9sPbXJ(cursorGmNWMfvn6zlEj.getInt(i17));
                    iJ0zjQ7CAgohuxU20eCW28 = i17;
                    int i18 = iJ0zjQ7CAgohuxU20eCW29;
                    boolean z2 = cursorGmNWMfvn6zlEj.getInt(i18) != 0;
                    iJ0zjQ7CAgohuxU20eCW29 = i18;
                    int i19 = iJ0zjQ7CAgohuxU20eCW30;
                    boolean z3 = cursorGmNWMfvn6zlEj.getInt(i19) != 0;
                    iJ0zjQ7CAgohuxU20eCW30 = i19;
                    int i20 = iJ0zjQ7CAgohuxU20eCW31;
                    boolean z4 = cursorGmNWMfvn6zlEj.getInt(i20) != 0;
                    iJ0zjQ7CAgohuxU20eCW31 = i20;
                    int i21 = iJ0zjQ7CAgohuxU20eCW32;
                    boolean z5 = cursorGmNWMfvn6zlEj.getInt(i21) != 0;
                    iJ0zjQ7CAgohuxU20eCW32 = i21;
                    int i22 = iJ0zjQ7CAgohuxU20eCW33;
                    long j9 = cursorGmNWMfvn6zlEj.getLong(i22);
                    iJ0zjQ7CAgohuxU20eCW33 = i22;
                    int i23 = iJ0zjQ7CAgohuxU20eCW34;
                    long j10 = cursorGmNWMfvn6zlEj.getLong(i23);
                    iJ0zjQ7CAgohuxU20eCW34 = i23;
                    int i24 = iJ0zjQ7CAgohuxU20eCW35;
                    if (!cursorGmNWMfvn6zlEj.isNull(i24)) {
                        blob = cursorGmNWMfvn6zlEj.getBlob(i24);
                    }
                    iJ0zjQ7CAgohuxU20eCW35 = i24;
                    arrayList.add(new sFdNPiaH9eT4T(string, iNQilHWaqS401ZtR, string2, string3, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2, j, j2, j3, new RdWywP7AQUqPn0G(iWotphlvK9sPbXJ, z2, z3, z4, z5, j9, j10, jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF(blob)), i2, iGIIiyi2ddlMDR0, j4, j5, j6, j7, z, iQrz92kRPw4GcghAc, i9, i11, j8, i14, i16));
                    iJ0zjQ7CAgohuxU20eCW6 = i4;
                    i = i3;
                }
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
        }
    }

    public final void vekpFI4d1Nc4fakF(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = this.JXn4Qf7zpnLjP5;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        int i = 80 - 79;
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(i);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, i);
        }
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    public final void w9sT1Swbhx3hs(HashMap map) {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            Iterator it = setKeySet.iterator();
            loop0: while (true) {
                i = 0;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String str = (String) it.next();
                    map2.put(str, (ArrayList) map.get(str));
                    i++;
                } while (i != 999);
                w9sT1Swbhx3hs(map2);
                map2 = new HashMap(999);
            }
            if (i > 0) {
                w9sT1Swbhx3hs(map2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append("?");
            if (i2 < size - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF(sb.toString(), size);
        int i3 = 1;
        for (String str2 : setKeySet) {
            if (str2 == null) {
                ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(i3);
            } else {
                ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str2, i3);
            }
            i3++;
        }
        Cursor cursorGmNWMfvn6zlEj = this.dDIMxZXP1V8HdM.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iNQilHWaqS401ZtR = SbxdZ6Kq2uhHQ5RPRqm.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj, "work_spec_id");
            if (iNQilHWaqS401ZtR == -1) {
                return;
            }
            while (cursorGmNWMfvn6zlEj.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorGmNWMfvn6zlEj.getString(iNQilHWaqS401ZtR));
                if (arrayList != null) {
                    arrayList.add(cursorGmNWMfvn6zlEj.isNull(0) ? null : cursorGmNWMfvn6zlEj.getString(0));
                }
            }
        } finally {
            cursorGmNWMfvn6zlEj.close();
        }
    }

    public final void wotphlvK9sPbXJ(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        wrjXKFWxtWGPk22 wrjxkfwxtwgpk22 = this.gIIiyi2ddlMDR0;
        IvGcaSCdlPOakpJ6v ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM = wrjxkfwxtwgpk22.dDIMxZXP1V8HdM();
        ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.wotphlvK9sPbXJ(1, j);
        if (str == null) {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.xDyLpEZyrcKVe0(2);
        } else {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.MLSIo1htfMPWeB8V876L(str, 2);
        }
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
            wrjxkfwxtwgpk22.gIIiyi2ddlMDR0(ivGcaSCdlPOakpJ6vDDIMxZXP1V8HdM);
        }
    }

    public final ArrayList xDyLpEZyrcKVe0(int i) throws Throwable {
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqfor;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        ez6sozeos7kkqzccqforD5P1xCAyuvgF.wotphlvK9sPbXJ(1, i);
        WorkDatabase_Impl workDatabase_Impl = this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iJ0zjQ7CAgohuxU20eCW6 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "id");
            int iJ0zjQ7CAgohuxU20eCW7 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "state");
            int iJ0zjQ7CAgohuxU20eCW8 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "worker_class_name");
            int iJ0zjQ7CAgohuxU20eCW9 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input_merger_class_name");
            int iJ0zjQ7CAgohuxU20eCW10 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "input");
            int iJ0zjQ7CAgohuxU20eCW11 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "output");
            int iJ0zjQ7CAgohuxU20eCW12 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "initial_delay");
            int iJ0zjQ7CAgohuxU20eCW13 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "interval_duration");
            int iJ0zjQ7CAgohuxU20eCW14 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "flex_duration");
            int iJ0zjQ7CAgohuxU20eCW15 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_attempt_count");
            int iJ0zjQ7CAgohuxU20eCW16 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_policy");
            int iJ0zjQ7CAgohuxU20eCW17 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "backoff_delay_duration");
            int iJ0zjQ7CAgohuxU20eCW18 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "last_enqueue_time");
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
            try {
                int iJ0zjQ7CAgohuxU20eCW19 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "minimum_retention_duration");
                int iJ0zjQ7CAgohuxU20eCW20 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "schedule_requested_at");
                int iJ0zjQ7CAgohuxU20eCW21 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "run_in_foreground");
                int iJ0zjQ7CAgohuxU20eCW22 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "out_of_quota_policy");
                int iJ0zjQ7CAgohuxU20eCW23 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "period_count");
                int iJ0zjQ7CAgohuxU20eCW24 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "generation");
                int iJ0zjQ7CAgohuxU20eCW25 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override");
                int iJ0zjQ7CAgohuxU20eCW26 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "next_schedule_time_override_generation");
                int iJ0zjQ7CAgohuxU20eCW27 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "stop_reason");
                int iJ0zjQ7CAgohuxU20eCW28 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "required_network_type");
                int iJ0zjQ7CAgohuxU20eCW29 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_charging");
                int iJ0zjQ7CAgohuxU20eCW30 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_device_idle");
                int iJ0zjQ7CAgohuxU20eCW31 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_battery_not_low");
                int iJ0zjQ7CAgohuxU20eCW32 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "requires_storage_not_low");
                int iJ0zjQ7CAgohuxU20eCW33 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_content_update_delay");
                int iJ0zjQ7CAgohuxU20eCW34 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "trigger_max_content_delay");
                int iJ0zjQ7CAgohuxU20eCW35 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "content_uri_triggers");
                int i2 = iJ0zjQ7CAgohuxU20eCW19;
                ArrayList arrayList = new ArrayList(cursorGmNWMfvn6zlEj.getCount());
                while (cursorGmNWMfvn6zlEj.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW6) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW6);
                    int iNQilHWaqS401ZtR = jb8et6SZeK5TWMrJFxDX.nQilHWaqS401ZtR(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW7));
                    String string2 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW8) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW8);
                    String string3 = cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW9) ? null : cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW9);
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW10) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW10));
                    MnLRqMow83uotly4qYT mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2 = MnLRqMow83uotly4qYT.dDIMxZXP1V8HdM(cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW11) ? null : cursorGmNWMfvn6zlEj.getBlob(iJ0zjQ7CAgohuxU20eCW11));
                    long j = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW12);
                    long j2 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW13);
                    long j3 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW14);
                    int i3 = cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW15);
                    int iGIIiyi2ddlMDR0 = jb8et6SZeK5TWMrJFxDX.gIIiyi2ddlMDR0(cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW16));
                    long j4 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW17);
                    long j5 = cursorGmNWMfvn6zlEj.getLong(iJ0zjQ7CAgohuxU20eCW18);
                    int i4 = i2;
                    long j6 = cursorGmNWMfvn6zlEj.getLong(i4);
                    int i5 = iJ0zjQ7CAgohuxU20eCW6;
                    int i6 = iJ0zjQ7CAgohuxU20eCW20;
                    long j7 = cursorGmNWMfvn6zlEj.getLong(i6);
                    iJ0zjQ7CAgohuxU20eCW20 = i6;
                    int i7 = iJ0zjQ7CAgohuxU20eCW21;
                    boolean z = cursorGmNWMfvn6zlEj.getInt(i7) != 0;
                    iJ0zjQ7CAgohuxU20eCW21 = i7;
                    int i8 = iJ0zjQ7CAgohuxU20eCW22;
                    int iQrz92kRPw4GcghAc = jb8et6SZeK5TWMrJFxDX.Qrz92kRPw4GcghAc(cursorGmNWMfvn6zlEj.getInt(i8));
                    iJ0zjQ7CAgohuxU20eCW22 = i8;
                    int i9 = iJ0zjQ7CAgohuxU20eCW23;
                    int i10 = cursorGmNWMfvn6zlEj.getInt(i9);
                    iJ0zjQ7CAgohuxU20eCW23 = i9;
                    int i11 = iJ0zjQ7CAgohuxU20eCW24;
                    int i12 = cursorGmNWMfvn6zlEj.getInt(i11);
                    iJ0zjQ7CAgohuxU20eCW24 = i11;
                    int i13 = iJ0zjQ7CAgohuxU20eCW25;
                    long j8 = cursorGmNWMfvn6zlEj.getLong(i13);
                    iJ0zjQ7CAgohuxU20eCW25 = i13;
                    int i14 = iJ0zjQ7CAgohuxU20eCW26;
                    int i15 = cursorGmNWMfvn6zlEj.getInt(i14);
                    iJ0zjQ7CAgohuxU20eCW26 = i14;
                    int i16 = iJ0zjQ7CAgohuxU20eCW27;
                    int i17 = cursorGmNWMfvn6zlEj.getInt(i16);
                    iJ0zjQ7CAgohuxU20eCW27 = i16;
                    int i18 = iJ0zjQ7CAgohuxU20eCW28;
                    int iWotphlvK9sPbXJ = jb8et6SZeK5TWMrJFxDX.wotphlvK9sPbXJ(cursorGmNWMfvn6zlEj.getInt(i18));
                    iJ0zjQ7CAgohuxU20eCW28 = i18;
                    int i19 = iJ0zjQ7CAgohuxU20eCW29;
                    boolean z2 = cursorGmNWMfvn6zlEj.getInt(i19) != 0;
                    iJ0zjQ7CAgohuxU20eCW29 = i19;
                    int i20 = iJ0zjQ7CAgohuxU20eCW30;
                    boolean z3 = cursorGmNWMfvn6zlEj.getInt(i20) != 0;
                    iJ0zjQ7CAgohuxU20eCW30 = i20;
                    int i21 = iJ0zjQ7CAgohuxU20eCW31;
                    boolean z4 = cursorGmNWMfvn6zlEj.getInt(i21) != 0;
                    iJ0zjQ7CAgohuxU20eCW31 = i21;
                    int i22 = iJ0zjQ7CAgohuxU20eCW32;
                    boolean z5 = cursorGmNWMfvn6zlEj.getInt(i22) != 0;
                    iJ0zjQ7CAgohuxU20eCW32 = i22;
                    int i23 = iJ0zjQ7CAgohuxU20eCW33;
                    long j9 = cursorGmNWMfvn6zlEj.getLong(i23);
                    iJ0zjQ7CAgohuxU20eCW33 = i23;
                    int i24 = iJ0zjQ7CAgohuxU20eCW34;
                    long j10 = cursorGmNWMfvn6zlEj.getLong(i24);
                    iJ0zjQ7CAgohuxU20eCW34 = i24;
                    int i25 = iJ0zjQ7CAgohuxU20eCW35;
                    if (!cursorGmNWMfvn6zlEj.isNull(i25)) {
                        blob = cursorGmNWMfvn6zlEj.getBlob(i25);
                    }
                    iJ0zjQ7CAgohuxU20eCW35 = i25;
                    arrayList.add(new sFdNPiaH9eT4T(string, iNQilHWaqS401ZtR, string2, string3, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM, mnLRqMow83uotly4qYTDDIMxZXP1V8HdM2, j, j2, j3, new RdWywP7AQUqPn0G(iWotphlvK9sPbXJ, z2, z3, z4, z5, j9, j10, jb8et6SZeK5TWMrJFxDX.vekpFI4d1Nc4fakF(blob)), i3, iGIIiyi2ddlMDR0, j4, j5, j6, j7, z, iQrz92kRPw4GcghAc, i10, i12, j8, i15, i17));
                    iJ0zjQ7CAgohuxU20eCW6 = i5;
                    i2 = i4;
                }
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorGmNWMfvn6zlEj.close();
                ez6sozeos7kkqzccqfor.hjneShqpF9Tis4();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ez6sozeos7kkqzccqfor = ez6sozeos7kkqzccqforD5P1xCAyuvgF;
        }
    }
}
