package v.s;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Qaufr4RG6hhFZDELvS {
    public static final HashMap Ee8d2j4S9Vm5yGuR = new HashMap();
    public FileChannel JXn4Qf7zpnLjP5;
    public final boolean dDIMxZXP1V8HdM;
    public final Lock vekpFI4d1Nc4fakF;
    public final File w9sT1Swbhx3hs;

    public Qaufr4RG6hhFZDELvS(String str, File file, boolean z) {
        Lock lock;
        this.dDIMxZXP1V8HdM = z;
        File file2 = new File(file, str.concat(".lck"));
        this.w9sT1Swbhx3hs = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap map = Ee8d2j4S9Vm5yGuR;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.vekpFI4d1Nc4fakF = lock;
    }

    private static /* synthetic */ void puak() {
    }

    public final void dDIMxZXP1V8HdM(boolean z) {
        File file = this.w9sT1Swbhx3hs;
        this.vekpFI4d1Nc4fakF.lock();
        if (z) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.JXn4Qf7zpnLjP5 = channel;
            } catch (IOException unused) {
                this.JXn4Qf7zpnLjP5 = null;
            }
        }
    }

    public final void w9sT1Swbhx3hs() {
        try {
            FileChannel fileChannel = this.JXn4Qf7zpnLjP5;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.vekpFI4d1Nc4fakF.unlock();
    }
}
