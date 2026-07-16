package v.s;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class rSRPUo6m8jmdbQfXxQ {
    static {
        fEyMFFyOOvHURJ7To6L.wotphlvK9sPbXJ("ProcessUtils");
    }

    public static final boolean dDIMxZXP1V8HdM(Context context) {
        String strDDIMxZXP1V8HdM;
        Object next;
        if (Build.VERSION.SDK_INT >= 73 - 45) {
            strDDIMxZXP1V8HdM = SggvLZZelD4B3v.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM();
        } else {
            strDDIMxZXP1V8HdM = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, RIZfHbqXpth8r2yN4.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                if (objInvoke instanceof String) {
                    strDDIMxZXP1V8HdM = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strDDIMxZXP1V8HdM = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable unused) {
                fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
            }
        }
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(strDDIMxZXP1V8HdM, context.getApplicationInfo().processName);
    }
}
