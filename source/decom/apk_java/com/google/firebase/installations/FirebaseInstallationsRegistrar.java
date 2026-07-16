package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import v.s.FVxyDmZ6Vklq5C;
import v.s.G6671wZlei2pbk4f8;
import v.s.H3cMHJSEFrHN;
import v.s.L3dp66w8ustOJLN7unY;
import v.s.OFtLBiBbrrTHWu;
import v.s.QwPxr2jx1iGLmehgkv3g;
import v.s.UPLbPDJGTcvz4zO;
import v.s.UeVBYgBvSKYfVuXLhMs;
import v.s.W6dfON4KdcdxlH;
import v.s.dfwkxUDiclPw1BowH4;
import v.s.iEFNWgvzPrlQ461CEU3;
import v.s.jNtR9eeHNtQpa;
import v.s.kha8vJMg5Bq7MuAMmONj;
import v.s.n7PoiLplax4gndPURV;
import v.s.rA0nQJPukyMi;
import v.s.rvAS0S3hc9OcOpI2kG;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    private static /* synthetic */ void gvjad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static L3dp66w8ustOJLN7unY lambda$getComponents$0(UPLbPDJGTcvz4zO uPLbPDJGTcvz4zO) {
        return new iEFNWgvzPrlQ461CEU3((dfwkxUDiclPw1BowH4) uPLbPDJGTcvz4zO.dDIMxZXP1V8HdM(dfwkxUDiclPw1BowH4.class), uPLbPDJGTcvz4zO.JXn4Qf7zpnLjP5(H3cMHJSEFrHN.class), (ExecutorService) uPLbPDJGTcvz4zO.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(G6671wZlei2pbk4f8.class, ExecutorService.class)), new jNtR9eeHNtQpa((Executor) uPLbPDJGTcvz4zO.vekpFI4d1Nc4fakF(new QwPxr2jx1iGLmehgkv3g(rvAS0S3hc9OcOpI2kG.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<FVxyDmZ6Vklq5C> getComponents() {
        n7PoiLplax4gndPURV n7poilplax4gndpurv = new n7PoiLplax4gndPURV(L3dp66w8ustOJLN7unY.class, new Class[0]);
        n7poilplax4gndpurv.dDIMxZXP1V8HdM = LIBRARY_NAME;
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(kha8vJMg5Bq7MuAMmONj.dDIMxZXP1V8HdM(dfwkxUDiclPw1BowH4.class));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(H3cMHJSEFrHN.class, 0, 1));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(new QwPxr2jx1iGLmehgkv3g(G6671wZlei2pbk4f8.class, ExecutorService.class), 1, 0));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(new QwPxr2jx1iGLmehgkv3g(rvAS0S3hc9OcOpI2kG.class, Executor.class), 1, 0));
        n7poilplax4gndpurv.xDyLpEZyrcKVe0 = new UeVBYgBvSKYfVuXLhMs(32 - 21);
        FVxyDmZ6Vklq5C fVxyDmZ6Vklq5CW9sT1Swbhx3hs = n7poilplax4gndpurv.w9sT1Swbhx3hs();
        W6dfON4KdcdxlH w6dfON4KdcdxlH = new W6dfON4KdcdxlH(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(W6dfON4KdcdxlH.class));
        return Arrays.asList(fVxyDmZ6Vklq5CW9sT1Swbhx3hs, new FVxyDmZ6Vklq5C(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new rA0nQJPukyMi(55 - 54, w6dfON4KdcdxlH), hashSet3), OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab(LIBRARY_NAME, "17.2.0"));
    }
}
