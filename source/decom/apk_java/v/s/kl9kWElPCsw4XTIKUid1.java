package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class kl9kWElPCsw4XTIKUid1 implements ThreadFactory {
    public final /* synthetic */ int dDIMxZXP1V8HdM;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                Thread thread = new Thread(runnable, TypefaceCache.obtain("00220063005F008E00FF00F200D600AB"));
                thread.setDaemon(true);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable, TypefaceCache.obtain("00350078005800CA00FB00BA00D700B70022007A0052009100F5"));
                thread2.setDaemon(true);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable, TypefaceCache.obtain("003300640054009F00E900F20096") + (System.nanoTime() % ((long) 10000)));
                thread3.setDaemon(true);
                return thread3;
        }
    }
}
