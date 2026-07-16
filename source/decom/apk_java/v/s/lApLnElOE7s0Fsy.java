package v.s;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class lApLnElOE7s0Fsy {
    public static final zcffvBooRp7uR1q dDIMxZXP1V8HdM;

    static {
        String property;
        int i = RN3oZ7h5zHy79TdFsDfo.dDIMxZXP1V8HdM;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = V6MzUQ0ByrLAmz0N.A1BaTVAMeIXMnh(new R7DJBBZoaraqxH(new oVCheESKQwsy4x(2, Arrays.asList(new UoxIZOBVZaubOFdPNaXK()).iterator()))).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((UoxIZOBVZaubOFdPNaXK) next).getClass();
                    do {
                        ((UoxIZOBVZaubOFdPNaXK) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((UoxIZOBVZaubOFdPNaXK) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            dDIMxZXP1V8HdM = new zcffvBooRp7uR1q(ssNNvt3whHpCoPj.dDIMxZXP1V8HdM(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    private static /* synthetic */ void xhbiy() {
    }
}
