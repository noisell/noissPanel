package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import v.s.DQAp3IAySlIpLgRF;
import v.s.FVxyDmZ6Vklq5C;
import v.s.G6671wZlei2pbk4f8;
import v.s.GFeyKt8p4Qhv;
import v.s.QwPxr2jx1iGLmehgkv3g;
import v.s.UeVBYgBvSKYfVuXLhMs;
import v.s.ZWT4Q2gfG7cBDIhWQsfN;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.jbtbKB2tTtjICZw;
import v.s.n7PoiLplax4gndPURV;
import v.s.rvAS0S3hc9OcOpI2kG;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final jbtbKB2tTtjICZw dDIMxZXP1V8HdM = new jbtbKB2tTtjICZw(new DQAp3IAySlIpLgRF(1));
    public static final jbtbKB2tTtjICZw w9sT1Swbhx3hs = new jbtbKB2tTtjICZw(new DQAp3IAySlIpLgRF(2));
    public static final jbtbKB2tTtjICZw vekpFI4d1Nc4fakF = new jbtbKB2tTtjICZw(new DQAp3IAySlIpLgRF(3));
    public static final jbtbKB2tTtjICZw JXn4Qf7zpnLjP5 = new jbtbKB2tTtjICZw(new DQAp3IAySlIpLgRF(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g = new QwPxr2jx1iGLmehgkv3g(G6671wZlei2pbk4f8.class, ScheduledExecutorService.class);
        QwPxr2jx1iGLmehgkv3g[] qwPxr2jx1iGLmehgkv3gArr = {new QwPxr2jx1iGLmehgkv3g(G6671wZlei2pbk4f8.class, ExecutorService.class), new QwPxr2jx1iGLmehgkv3g(G6671wZlei2pbk4f8.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qwPxr2jx1iGLmehgkv3g);
        for (QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g2 : qwPxr2jx1iGLmehgkv3gArr) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(qwPxr2jx1iGLmehgkv3g2, "Null interface");
        }
        Collections.addAll(hashSet, qwPxr2jx1iGLmehgkv3gArr);
        FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C = new FVxyDmZ6Vklq5C(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new UeVBYgBvSKYfVuXLhMs(1), hashSet3);
        QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g3 = new QwPxr2jx1iGLmehgkv3g(rvAS0S3hc9OcOpI2kG.class, ScheduledExecutorService.class);
        QwPxr2jx1iGLmehgkv3g[] qwPxr2jx1iGLmehgkv3gArr2 = {new QwPxr2jx1iGLmehgkv3g(rvAS0S3hc9OcOpI2kG.class, ExecutorService.class), new QwPxr2jx1iGLmehgkv3g(rvAS0S3hc9OcOpI2kG.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qwPxr2jx1iGLmehgkv3g3);
        for (QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g4 : qwPxr2jx1iGLmehgkv3gArr2) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(qwPxr2jx1iGLmehgkv3g4, "Null interface");
        }
        Collections.addAll(hashSet4, qwPxr2jx1iGLmehgkv3gArr2);
        FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C2 = new FVxyDmZ6Vklq5C(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new UeVBYgBvSKYfVuXLhMs(2), hashSet6);
        QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g5 = new QwPxr2jx1iGLmehgkv3g(ZWT4Q2gfG7cBDIhWQsfN.class, ScheduledExecutorService.class);
        QwPxr2jx1iGLmehgkv3g[] qwPxr2jx1iGLmehgkv3gArr3 = {new QwPxr2jx1iGLmehgkv3g(ZWT4Q2gfG7cBDIhWQsfN.class, ExecutorService.class), new QwPxr2jx1iGLmehgkv3g(ZWT4Q2gfG7cBDIhWQsfN.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qwPxr2jx1iGLmehgkv3g5);
        for (QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g6 : qwPxr2jx1iGLmehgkv3gArr3) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(qwPxr2jx1iGLmehgkv3g6, "Null interface");
        }
        Collections.addAll(hashSet7, qwPxr2jx1iGLmehgkv3gArr3);
        FVxyDmZ6Vklq5C fVxyDmZ6Vklq5C3 = new FVxyDmZ6Vklq5C(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new UeVBYgBvSKYfVuXLhMs(3), hashSet9);
        n7PoiLplax4gndPURV n7poilplax4gndpurvDDIMxZXP1V8HdM = FVxyDmZ6Vklq5C.dDIMxZXP1V8HdM(new QwPxr2jx1iGLmehgkv3g(GFeyKt8p4Qhv.class, Executor.class));
        n7poilplax4gndpurvDDIMxZXP1V8HdM.xDyLpEZyrcKVe0 = new UeVBYgBvSKYfVuXLhMs(4);
        return Arrays.asList(fVxyDmZ6Vklq5C, fVxyDmZ6Vklq5C2, fVxyDmZ6Vklq5C3, n7poilplax4gndpurvDDIMxZXP1V8HdM.w9sT1Swbhx3hs());
    }
}
