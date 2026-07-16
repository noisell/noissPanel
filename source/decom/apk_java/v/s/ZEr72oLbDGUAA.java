package v.s;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ZEr72oLbDGUAA extends okc5AGRjqrud84oM6d {
    public volatile Handler gmNWMfvn6zlEj;
    public final Object D5P1xCAyuvgF = new Object();
    public final ExecutorService hjneShqpF9Tis4 = Executors.newFixedThreadPool(4, new saVA9bdyRGPSWJ());

    public static Handler H9XlUr4OeMJFiXK(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return wPKkuB5tXUtJnC.dDIMxZXP1V8HdM(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
