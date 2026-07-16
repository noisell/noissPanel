package v.s;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class fUH025aw0Rgl {
    public Object JXn4Qf7zpnLjP5;
    public Object dDIMxZXP1V8HdM;
    public Object vekpFI4d1Nc4fakF;
    public Object w9sT1Swbhx3hs;

    public fUH025aw0Rgl(int i) {
        switch (i) {
            case 2:
                this.JXn4Qf7zpnLjP5 = new LinkedHashMap();
                this.w9sT1Swbhx3hs = "GET";
                this.vekpFI4d1Nc4fakF = new r5XEUfod5GSCCwq6c(11);
                break;
            default:
                this.w9sT1Swbhx3hs = new ArrayDeque();
                this.vekpFI4d1Nc4fakF = new ArrayDeque();
                this.JXn4Qf7zpnLjP5 = new ArrayDeque();
                break;
        }
    }

    public void D5P1xCAyuvgF(String str) {
        String strConcat;
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            strConcat = "http:".concat(str.substring(3));
        } else {
            strConcat = str.regionMatches(true, 0, "wss:", 0, 4) ? "https:".concat(str.substring(4)) : str;
        }
        JVe8d5JCsGlrBZvcax jVe8d5JCsGlrBZvcax = new JVe8d5JCsGlrBZvcax();
        jVe8d5JCsGlrBZvcax.vekpFI4d1Nc4fakF(null, strConcat);
        this.dDIMxZXP1V8HdM = jVe8d5JCsGlrBZvcax.dDIMxZXP1V8HdM();
    }

    public void Ee8d2j4S9Vm5yGuR(String str, String str2) {
        ((r5XEUfod5GSCCwq6c) this.vekpFI4d1Nc4fakF).yTljMGnIibTRdOpSh4(str, str2);
    }

    public x0NSvOTfFiEnik JXn4Qf7zpnLjP5(ebR1taU40KcOGClk ebr1tau40kcogclk) {
        String str = ebr1tau40kcogclk.dDIMxZXP1V8HdM;
        int i = ebr1tau40kcogclk.w9sT1Swbhx3hs;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.dDIMxZXP1V8HdM;
        eZ6soZeOs7kkqZcCQFOR ez6sozeos7kkqzccqforD5P1xCAyuvgF = eZ6soZeOs7kkqZcCQFOR.D5P1xCAyuvgF("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.xDyLpEZyrcKVe0(1);
        } else {
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.MLSIo1htfMPWeB8V876L(str, 1);
        }
        ez6sozeos7kkqzccqforD5P1xCAyuvgF.wotphlvK9sPbXJ(2, i);
        workDatabase_Impl.w9sT1Swbhx3hs();
        Cursor cursorGmNWMfvn6zlEj = workDatabase_Impl.gmNWMfvn6zlEj(ez6sozeos7kkqzccqforD5P1xCAyuvgF);
        try {
            int iJ0zjQ7CAgohuxU20eCW6 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "work_spec_id");
            int iJ0zjQ7CAgohuxU20eCW7 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "generation");
            int iJ0zjQ7CAgohuxU20eCW8 = SbxdZ6Kq2uhHQ5RPRqm.J0zjQ7CAgohuxU20eCW6(cursorGmNWMfvn6zlEj, "system_id");
            x0NSvOTfFiEnik x0nsvotffienik = null;
            String string = null;
            if (cursorGmNWMfvn6zlEj.moveToFirst()) {
                if (!cursorGmNWMfvn6zlEj.isNull(iJ0zjQ7CAgohuxU20eCW6)) {
                    string = cursorGmNWMfvn6zlEj.getString(iJ0zjQ7CAgohuxU20eCW6);
                }
                x0nsvotffienik = new x0NSvOTfFiEnik(string, cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW7), cursorGmNWMfvn6zlEj.getInt(iJ0zjQ7CAgohuxU20eCW8));
            }
            return x0nsvotffienik;
        } finally {
            cursorGmNWMfvn6zlEj.close();
            ez6sozeos7kkqzccqforD5P1xCAyuvgF.hjneShqpF9Tis4();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:22:0x006f, B:24:0x0075, B:27:0x00a7), top: B:48:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0075, please report this as an issue */
    public void b1EoSIRjJHO5() {
        int size;
        int i;
        exQloPNkvIFRvh exqlopnkvifrvh;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.w9sT1Swbhx3hs).iterator();
                while (it.hasNext()) {
                    exQloPNkvIFRvh exqlopnkvifrvh2 = (exQloPNkvIFRvh) it.next();
                    if (((ArrayDeque) this.vekpFI4d1Nc4fakF).size() >= 64) {
                        break;
                    }
                    if (exqlopnkvifrvh2.vekpFI4d1Nc4fakF.get() < 5) {
                        it.remove();
                        exqlopnkvifrvh2.vekpFI4d1Nc4fakF.incrementAndGet();
                        arrayList.add(exqlopnkvifrvh2);
                        ((ArrayDeque) this.vekpFI4d1Nc4fakF).add(exqlopnkvifrvh2);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.vekpFI4d1Nc4fakF).size();
                    ((ArrayDeque) this.JXn4Qf7zpnLjP5).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    exqlopnkvifrvh = (exQloPNkvIFRvh) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.dDIMxZXP1V8HdM) == null) {
                                this.dDIMxZXP1V8HdM = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new Daw7QaVwgN3e6(yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0 + " Dispatcher", false));
                            }
                            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.dDIMxZXP1V8HdM;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    VdAulbq7zlVjr545h vdAulbq7zlVjr545h = exqlopnkvifrvh.JXn4Qf7zpnLjP5;
                    byte[] bArr2 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                    try {
                        try {
                            threadPoolExecutor.execute(exqlopnkvifrvh);
                        } catch (Throwable th2) {
                            vdAulbq7zlVjr545h.w9sT1Swbhx3hs.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(exqlopnkvifrvh);
                            throw th2;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        vdAulbq7zlVjr545h.b1EoSIRjJHO5(interruptedIOException);
                        ((J1m0XraSkScfWFMIlTC) exqlopnkvifrvh.w9sT1Swbhx3hs.w9sT1Swbhx3hs).vekpFI4d1Nc4fakF(interruptedIOException, null);
                        vdAulbq7zlVjr545h.w9sT1Swbhx3hs.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(exqlopnkvifrvh);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        size = arrayList.size();
        while (i < size) {
            exqlopnkvifrvh = (exQloPNkvIFRvh) arrayList.get(i);
            synchronized (this) {
                if (((ThreadPoolExecutor) this.dDIMxZXP1V8HdM) == null) {
                    this.dDIMxZXP1V8HdM = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new Daw7QaVwgN3e6(yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0 + " Dispatcher", false));
                }
                ThreadPoolExecutor threadPoolExecutor2 = (ThreadPoolExecutor) this.dDIMxZXP1V8HdM;
                VdAulbq7zlVjr545h vdAulbq7zlVjr545h2 = exqlopnkvifrvh.JXn4Qf7zpnLjP5;
                byte[] bArr3 = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                threadPoolExecutor2.execute(exqlopnkvifrvh);
            }
        }
    }

    public iniVyKd0OGb2raI4 dDIMxZXP1V8HdM() {
        xc6AKez33c65zO xc6akez33c65zo = (xc6AKez33c65zO) this.dDIMxZXP1V8HdM;
        if (xc6akez33c65zo == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.w9sT1Swbhx3hs;
        SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8IbVTtJUNfrGYbW = ((r5XEUfod5GSCCwq6c) this.vekpFI4d1Nc4fakF).ibVTtJUNfrGYbW();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.JXn4Qf7zpnLjP5;
        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
        return new iniVyKd0OGb2raI4(xc6akez33c65zo, str, szicGcOQovJ1JhxwfLo8IbVTtJUNfrGYbW, (jb8et6SZeK5TWMrJFxDX) null, linkedHashMap.isEmpty() ? jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
    }

    public void ibVTtJUNfrGYbW(String str, jb8et6SZeK5TWMrJFxDX jb8et6szek5twmrjfxdx) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (jb8et6szek5twmrjfxdx == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!OFtLBiBbrrTHWu.DVTNwpDEVsUKuznof(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.w9sT1Swbhx3hs = str;
    }

    public void pyu8ovAipBTLYAiKab(String str) {
        ((r5XEUfod5GSCCwq6c) this.vekpFI4d1Nc4fakF).EWUjsTERgdPbSw3NNlN(str);
    }

    public void vekpFI4d1Nc4fakF(exQloPNkvIFRvh exqlopnkvifrvh) {
        exqlopnkvifrvh.vekpFI4d1Nc4fakF.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.vekpFI4d1Nc4fakF;
        synchronized (this) {
            if (!arrayDeque.remove(exqlopnkvifrvh)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b1EoSIRjJHO5();
    }

    public void w9sT1Swbhx3hs(Runnable runnable) {
        ((NTq6GnI9WZIP8Nuz) this.dDIMxZXP1V8HdM).execute(runnable);
    }

    public void xDyLpEZyrcKVe0(x0NSvOTfFiEnik x0nsvotffienik) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.dDIMxZXP1V8HdM;
        workDatabase_Impl.w9sT1Swbhx3hs();
        workDatabase_Impl.vekpFI4d1Nc4fakF();
        try {
            ((LeKZUBhDBK6LgUr) this.w9sT1Swbhx3hs).nQilHWaqS401ZtR(x0nsvotffienik);
            workDatabase_Impl.wotphlvK9sPbXJ();
        } finally {
            workDatabase_Impl.D5P1xCAyuvgF();
        }
    }
}
