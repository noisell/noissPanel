package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import v.s.FVxyDmZ6Vklq5C;
import v.s.JIlQIGti1DoC;
import v.s.L3dp66w8ustOJLN7unY;
import v.s.OFtLBiBbrrTHWu;
import v.s.QbnuJYfmluA6tNLYu;
import v.s.RqLIwoK3mjYHtQ7Aj;
import v.s.UPLbPDJGTcvz4zO;
import v.s.UeVBYgBvSKYfVuXLhMs;
import v.s.UzEeGez5ozIstW0r;
import v.s.dfwkxUDiclPw1BowH4;
import v.s.kGIhwaqen3iSouOraOKT;
import v.s.kha8vJMg5Bq7MuAMmONj;
import v.s.n7PoiLplax4gndPURV;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(UPLbPDJGTcvz4zO uPLbPDJGTcvz4zO) {
        dfwkxUDiclPw1BowH4 dfwkxudiclpw1bowh4 = (dfwkxUDiclPw1BowH4) uPLbPDJGTcvz4zO.dDIMxZXP1V8HdM(dfwkxUDiclPw1BowH4.class);
        if (uPLbPDJGTcvz4zO.dDIMxZXP1V8HdM(UzEeGez5ozIstW0r.class) == null) {
            return new FirebaseMessaging(dfwkxudiclpw1bowh4, uPLbPDJGTcvz4zO.JXn4Qf7zpnLjP5(JIlQIGti1DoC.class), uPLbPDJGTcvz4zO.JXn4Qf7zpnLjP5(kGIhwaqen3iSouOraOKT.class), (L3dp66w8ustOJLN7unY) uPLbPDJGTcvz4zO.dDIMxZXP1V8HdM(L3dp66w8ustOJLN7unY.class), (QbnuJYfmluA6tNLYu) uPLbPDJGTcvz4zO.dDIMxZXP1V8HdM(QbnuJYfmluA6tNLYu.class), (RqLIwoK3mjYHtQ7Aj) uPLbPDJGTcvz4zO.dDIMxZXP1V8HdM(RqLIwoK3mjYHtQ7Aj.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<FVxyDmZ6Vklq5C> getComponents() {
        n7PoiLplax4gndPURV n7poilplax4gndpurv = new n7PoiLplax4gndPURV(FirebaseMessaging.class, new Class[0]);
        n7poilplax4gndpurv.dDIMxZXP1V8HdM = LIBRARY_NAME;
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(kha8vJMg5Bq7MuAMmONj.dDIMxZXP1V8HdM(dfwkxUDiclPw1BowH4.class));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(UzEeGez5ozIstW0r.class, 0, 0));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(JIlQIGti1DoC.class, 0, 1));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(kGIhwaqen3iSouOraOKT.class, 0, 1));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(new kha8vJMg5Bq7MuAMmONj(QbnuJYfmluA6tNLYu.class, 0, 0));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(kha8vJMg5Bq7MuAMmONj.dDIMxZXP1V8HdM(L3dp66w8ustOJLN7unY.class));
        n7poilplax4gndpurv.dDIMxZXP1V8HdM(kha8vJMg5Bq7MuAMmONj.dDIMxZXP1V8HdM(RqLIwoK3mjYHtQ7Aj.class));
        n7poilplax4gndpurv.xDyLpEZyrcKVe0 = new UeVBYgBvSKYfVuXLhMs(13);
        if (!(n7poilplax4gndpurv.JXn4Qf7zpnLjP5 == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        n7poilplax4gndpurv.JXn4Qf7zpnLjP5 = 1;
        return Arrays.asList(n7poilplax4gndpurv.w9sT1Swbhx3hs(), OFtLBiBbrrTHWu.pyu8ovAipBTLYAiKab(LIBRARY_NAME, "23.4.1"));
    }
}
