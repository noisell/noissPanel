package v.s;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class YgNx8HKgNruMC7D extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                ReentrantLock reentrantLock = hY5LMKhGGQVxmKz6FME.b1EoSIRjJHO5;
                reentrantLock.lock();
                try {
                    hY5LMKhGGQVxmKz6FME hy5lmkhggqvxmkz6fmeVekpFI4d1Nc4fakF = FZ1sl4mHq4J0hOEYC.vekpFI4d1Nc4fakF();
                    if (hy5lmkhggqvxmkz6fmeVekpFI4d1Nc4fakF == hY5LMKhGGQVxmKz6FME.gmNWMfvn6zlEj) {
                        hY5LMKhGGQVxmKz6FME.gmNWMfvn6zlEj = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (hy5lmkhggqvxmkz6fmeVekpFI4d1Nc4fakF != null) {
                            hy5lmkhggqvxmkz6fmeVekpFI4d1Nc4fakF.hjneShqpF9Tis4();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }
}
