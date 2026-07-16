package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import v.s.DixbgjZDrgKGsYk0Hj;
import v.s.FVxyDmZ6Vklq5C;
import v.s.OFtLBiBbrrTHWu;
import v.s.QbnuJYfmluA6tNLYu;
import v.s.QwPxr2jx1iGLmehgkv3g;
import v.s.ULO76INtY6ygYJ;
import v.s.UPLbPDJGTcvz4zO;
import v.s.UWYuX9UTvV9YpFO4TOW;
import v.s.UeVBYgBvSKYfVuXLhMs;
import v.s.j378CNXHLyDTS1wSJ;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.kha8vJMg5Bq7MuAMmONj;
import v.s.oO26y14q3Pwf;
import v.s.wPtsfm3myEKujwPqCE;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static QbnuJYfmluA6tNLYu lambda$getComponents$0(UPLbPDJGTcvz4zO uPLbPDJGTcvz4zO) {
        byte[] bytes;
        j378CNXHLyDTS1wSJ.w9sT1Swbhx3hs((Context) uPLbPDJGTcvz4zO.dDIMxZXP1V8HdM(Context.class));
        j378CNXHLyDTS1wSJ j378cnxhlydts1wsjDDIMxZXP1V8HdM = j378CNXHLyDTS1wSJ.dDIMxZXP1V8HdM();
        ULO76INtY6ygYJ uLO76INtY6ygYJ = ULO76INtY6ygYJ.Ee8d2j4S9Vm5yGuR;
        j378cnxhlydts1wsjDDIMxZXP1V8HdM.getClass();
        Set setUnmodifiableSet = uLO76INtY6ygYJ != null ? Collections.unmodifiableSet(ULO76INtY6ygYJ.JXn4Qf7zpnLjP5) : Collections.singleton(new DixbgjZDrgKGsYk0Hj("proto"));
        UWYuX9UTvV9YpFO4TOW uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM = oO26y14q3Pwf.dDIMxZXP1V8HdM();
        uLO76INtY6ygYJ.getClass();
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.w9sT1Swbhx3hs = "cct";
        String str = uLO76INtY6ygYJ.dDIMxZXP1V8HdM;
        String str2 = uLO76INtY6ygYJ.w9sT1Swbhx3hs;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.vekpFI4d1Nc4fakF = bytes;
        return new wPtsfm3myEKujwPqCE(setUnmodifiableSet, uWYuX9UTvV9YpFO4TOWDDIMxZXP1V8HdM.dDIMxZXP1V8HdM(), j378cnxhlydts1wsjDDIMxZXP1V8HdM);
    }

    private static /* synthetic */ void wfskep() {
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<FVxyDmZ6Vklq5C> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(QbnuJYfmluA6tNLYu.class));
        for (Class cls : new Class[0]) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(cls, "Null interface");
            hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls));
        }
        kha8vJMg5Bq7MuAMmONj kha8vjmg5bq7muammonjDDIMxZXP1V8HdM = kha8vJMg5Bq7MuAMmONj.dDIMxZXP1V8HdM(Context.class);
        if (hashSet.contains(kha8vjmg5bq7muammonjDDIMxZXP1V8HdM.dDIMxZXP1V8HdM)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(kha8vjmg5bq7muammonjDDIMxZXP1V8HdM);
        return Arrays.asList(new FVxyDmZ6Vklq5C(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new UeVBYgBvSKYfVuXLhMs(19), hashSet3), OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab(LIBRARY_NAME, "18.1.7"));
    }
}
