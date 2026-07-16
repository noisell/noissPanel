package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import v.s.ALblcarwcMqLybfR5;
import v.s.LutdQZ2I9fVx;
import v.s.UWYuX9UTvV9YpFO4TOW;
import v.s.j378CNXHLyDTS1wSJ;
import v.s.jdOQeRk37T35X5xKW1P;
import v.s.oAbr1ycaDgFnfg;
import v.s.oO26y14q3Pwf;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    private static /* synthetic */ void kjjcwgyrp() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        j378CNXHLyDTS1wSJ.w9sT1Swbhx3hs(context);
        UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM = oO26y14q3Pwf.dDIMxZXP1V8HdM();
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.ibVTtJUNfrGYbW(queryParameter);
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.JXn4Qf7zpnLjP5 = oAbr1ycaDgFnfg.w9sT1Swbhx3hs(iIntValue);
        if (queryParameter2 != null) {
            uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF = Base64.decode(queryParameter2, 0);
        }
        LutdQZ2I9fVx lutdQZ2I9fVx = j378CNXHLyDTS1wSJ.dDIMxZXP1V8HdM().JXn4Qf7zpnLjP5;
        lutdQZ2I9fVx.Ee8d2j4S9Vm5yGuR.execute(new ALblcarwcMqLybfR5(lutdQZ2I9fVx, uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.dDIMxZXP1V8HdM(), i, new jdOQeRk37T35X5xKW1P(0)));
    }
}
