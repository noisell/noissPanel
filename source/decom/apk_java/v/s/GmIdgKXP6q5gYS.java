package v.s;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class GmIdgKXP6q5gYS {
    public static final Method dDIMxZXP1V8HdM;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        dDIMxZXP1V8HdM = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }

    private static /* synthetic */ void ikvk() {
    }
}
