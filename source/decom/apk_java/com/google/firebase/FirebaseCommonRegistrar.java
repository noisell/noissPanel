package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import v.s.A8Ma74sVrwIpGnRFB9;
import v.s.FVxyDmZ6Vklq5C;
import v.s.G6671wZlei2pbk4f8;
import v.s.H3cMHJSEFrHN;
import v.s.JIlQIGti1DoC;
import v.s.OFtLBiBbrrTHWu;
import v.s.QwPxr2jx1iGLmehgkv3g;
import v.s.TT2KHOpLgEiQtjhkGm;
import v.s.UeVBYgBvSKYfVuXLhMs;
import v.s.W6dfON4KdcdxlH;
import v.s.WfDiJ9fpTiab;
import v.s.dfwkxUDiclPw1BowH4;
import v.s.jb8et6SZeK5TWMrJFxDX;
import v.s.kGIhwaqen3iSouOraOKT;
import v.s.kha8vJMg5Bq7MuAMmONj;
import v.s.n7PoiLplax4gndPURV;
import v.s.rA0nQJPukyMi;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [char, int] */
    public static String dDIMxZXP1V8HdM(String str) {
        return str.replace(' ', '_').replace((char) (70 - 23), '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(JIlQIGti1DoC.class));
        for (Class cls : new Class[0]) {
            jb8et6SZeK5TWMrJFxDX.JXn4Qf7zpnLjP5(cls, "Null interface");
            hashSet.add(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(cls));
        }
        kha8vJMg5Bq7MuAMmONj kha8vjmg5bq7muammonj = new kha8vJMg5Bq7MuAMmONj(A8Ma74sVrwIpGnRFB9.class, 2, 0);
        if (hashSet.contains(kha8vjmg5bq7muammonj.dDIMxZXP1V8HdM)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(kha8vjmg5bq7muammonj);
        arrayList.add(new FVxyDmZ6Vklq5C(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new UeVBYgBvSKYfVuXLhMs(0), hashSet3));
        QwPxr2jx1iGLmehgkv3g qwPxr2jx1iGLmehgkv3g = new QwPxr2jx1iGLmehgkv3g(G6671wZlei2pbk4f8.class, Executor.class);
        n7PoiLplax4gndPURV n7poilplax4gndpurv = new n7PoiLplax4gndPURV(TT2KHOpLgEiQtjhkGm.class, new Class[]{H3cMHJSEFrHN.class, kGIhwaqen3iSouOraOKT.class});
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(kha8vJMg5Bq7MuAMmONj.dDIMxZXP1V8HdM(Context.class));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(kha8vJMg5Bq7MuAMmONj.dDIMxZXP1V8HdM(dfwkxUDiclPw1BowH4.class));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(W6dfON4KdcdxlH.class, 2, 0));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(JIlQIGti1DoC.class, 1, 1));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(qwPxr2jx1iGLmehgkv3g, 1, 0));
        n7poilplax4gndpurv.xDyLpEZyrcKVe0 = new rA0nQJPukyMi(2, qwPxr2jx1iGLmehgkv3g);
        arrayList.add(n7poilplax4gndpurv.w9sT1Swbhx3hs());
        arrayList.add(OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab("fire-core", "20.4.2"));
        arrayList.add(OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab("device-name", dDIMxZXP1V8HdM(Build.PRODUCT)));
        arrayList.add(OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab("device-model", dDIMxZXP1V8HdM(Build.DEVICE)));
        arrayList.add(OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab("device-brand", dDIMxZXP1V8HdM(Build.BRAND)));
        arrayList.add(OFtLBiBbrrTHWu.Qrz92kRPw4GcghAc("android-target-sdk", new UeVBYgBvSKYfVuXLhMs(7)));
        arrayList.add(OFtLBiBbrrTHWu.Qrz92kRPw4GcghAc("android-min-sdk", new UeVBYgBvSKYfVuXLhMs(8)));
        arrayList.add(OFtLBiBbrrTHWu.Qrz92kRPw4GcghAc("android-platform", new UeVBYgBvSKYfVuXLhMs(9)));
        arrayList.add(OFtLBiBbrrTHWu.Qrz92kRPw4GcghAc("android-installer", new UeVBYgBvSKYfVuXLhMs(10)));
        try {
            WfDiJ9fpTiab.vekpFI4d1Nc4fakF.getClass();
            str = "1.9.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab("kotlin", str));
        }
        return arrayList;
    }
}
