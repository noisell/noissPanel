package androidx.work.impl;

import android.database.Cursor;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v.s.B2htgWMZxsdry;
import v.s.Hnsrhf2jJV8dCt;
import v.s.IXBvAqS2fpdIRK;
import v.s.UWYuX9UTvV9YpFO4TOW;
import v.s.W3MG38bRt8NhVbCQ;
import v.s.cEBaU8QnH2devCCLv3V;
import v.s.eTeIZwLyooQrZ0ICI9i;
import v.s.eyije75asyarHGHdxkfX;
import v.s.fUH025aw0Rgl;
import v.s.icsq4nzWNlK1KIU2Hp;
import v.s.jB7suWpUqheaHlr52SG;
import v.s.nLrxl2ExJj45rGBsZNLQ;
import v.s.ockqdHYT4cIpIHmIOJN;
import v.s.qkzRt1s9DJNNYwsqt;
import v.s.wSoqO88HRpr5B2md;
import v.s.z4xRvJ1RJf5JDR;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class WorkDatabase {
    public final LinkedHashMap D5P1xCAyuvgF;
    public boolean Ee8d2j4S9Vm5yGuR;
    public volatile eyije75asyarHGHdxkfX dDIMxZXP1V8HdM;
    public z4xRvJ1RJf5JDR vekpFI4d1Nc4fakF;
    public Executor w9sT1Swbhx3hs;
    public List xDyLpEZyrcKVe0;
    public final W3MG38bRt8NhVbCQ JXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5();
    public final LinkedHashMap ibVTtJUNfrGYbW = new LinkedHashMap();
    public final ReentrantReadWriteLock b1EoSIRjJHO5 = new ReentrantReadWriteLock();
    public final ThreadLocal pyu8ovAipBTLYAiKab = new ThreadLocal();

    public WorkDatabase() {
        Collections.synchronizedMap(new LinkedHashMap());
        this.D5P1xCAyuvgF = new LinkedHashMap();
    }

    private static /* synthetic */ void jbgtux() {
    }

    public static Object nQilHWaqS401ZtR(Class cls, z4xRvJ1RJf5JDR z4xrvj1rjf5jdr) {
        if (cls.isInstance(z4xrvj1rjf5jdr)) {
            return z4xrvj1rjf5jdr;
        }
        if (z4xrvj1rjf5jdr instanceof ockqdHYT4cIpIHmIOJN) {
            return nQilHWaqS401ZtR(cls, ((ockqdHYT4cIpIHmIOJN) z4xrvj1rjf5jdr).dDIMxZXP1V8HdM());
        }
        return null;
    }

    public final void D5P1xCAyuvgF() {
        z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = this.vekpFI4d1Nc4fakF;
        if (z4xrvj1rjf5jdr == null) {
            z4xrvj1rjf5jdr = null;
        }
        z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb().hjneShqpF9Tis4();
        z4xRvJ1RJf5JDR z4xrvj1rjf5jdr2 = this.vekpFI4d1Nc4fakF;
        if (z4xrvj1rjf5jdr2 == null) {
            z4xrvj1rjf5jdr2 = null;
        }
        if (z4xrvj1rjf5jdr2.l1V0lQr6TbwNKqHfXNbb().EWUjsTERgdPbSw3NNlN()) {
            return;
        }
        W3MG38bRt8NhVbCQ w3MG38bRt8NhVbCQ = this.JXn4Qf7zpnLjP5;
        if (w3MG38bRt8NhVbCQ.Ee8d2j4S9Vm5yGuR.compareAndSet(false, true)) {
            Executor executor = w3MG38bRt8NhVbCQ.dDIMxZXP1V8HdM.w9sT1Swbhx3hs;
            (executor != null ? executor : null).execute(w3MG38bRt8NhVbCQ.gmNWMfvn6zlEj);
        }
    }

    public abstract z4xRvJ1RJf5JDR Ee8d2j4S9Vm5yGuR(cEBaU8QnH2devCCLv3V cebau8qnh2devcclv3v);

    public abstract UWYuX9UTvV9YpFO4TOW H9XlUr4OeMJFiXK();

    public abstract IXBvAqS2fpdIRK J0zjQ7CAgohuxU20eCW6();

    public abstract W3MG38bRt8NhVbCQ JXn4Qf7zpnLjP5();

    public abstract eTeIZwLyooQrZ0ICI9i MLSIo1htfMPWeB8V876L();

    public abstract fUH025aw0Rgl Qrz92kRPw4GcghAc();

    public abstract nLrxl2ExJj45rGBsZNLQ XiR1pIn5878vVWd();

    public Set b1EoSIRjJHO5() {
        return wSoqO88HRpr5B2md.w9sT1Swbhx3hs;
    }

    public final void dDIMxZXP1V8HdM() {
        if (!this.Ee8d2j4S9Vm5yGuR && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final Object gIIiyi2ddlMDR0(Callable callable) {
        vekpFI4d1Nc4fakF();
        try {
            Object objCall = callable.call();
            wotphlvK9sPbXJ();
            return objCall;
        } finally {
            D5P1xCAyuvgF();
        }
    }

    public final Cursor gmNWMfvn6zlEj(B2htgWMZxsdry b2htgWMZxsdry) {
        dDIMxZXP1V8HdM();
        w9sT1Swbhx3hs();
        z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = this.vekpFI4d1Nc4fakF;
        if (z4xrvj1rjf5jdr == null) {
            z4xrvj1rjf5jdr = null;
        }
        return z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb().O2DHNSIGZlgPja7eqLgn(b2htgWMZxsdry);
    }

    public abstract icsq4nzWNlK1KIU2Hp hjneShqpF9Tis4();

    public List ibVTtJUNfrGYbW() {
        return qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
    }

    public Map pyu8ovAipBTLYAiKab() {
        return jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs;
    }

    public final void vekpFI4d1Nc4fakF() {
        dDIMxZXP1V8HdM();
        dDIMxZXP1V8HdM();
        z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = this.vekpFI4d1Nc4fakF;
        if (z4xrvj1rjf5jdr == null) {
            z4xrvj1rjf5jdr = null;
        }
        eyije75asyarHGHdxkfX eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb = z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb();
        this.JXn4Qf7zpnLjP5.vekpFI4d1Nc4fakF(eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb);
        if (eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb.vIJudZvPyTuNp()) {
            eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb.vekpFI4d1Nc4fakF();
        } else {
            eyije75asyarhghdxkfxL1V0lQr6TbwNKqHfXNbb.dDIMxZXP1V8HdM();
        }
    }

    public final void w9sT1Swbhx3hs() {
        z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = this.vekpFI4d1Nc4fakF;
        if (z4xrvj1rjf5jdr == null) {
            z4xrvj1rjf5jdr = null;
        }
        if (!z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb().EWUjsTERgdPbSw3NNlN() && this.pyu8ovAipBTLYAiKab.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void wotphlvK9sPbXJ() {
        z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = this.vekpFI4d1Nc4fakF;
        if (z4xrvj1rjf5jdr == null) {
            z4xrvj1rjf5jdr = null;
        }
        z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb().xfn2GJwmGqs7kWW();
    }

    public abstract Hnsrhf2jJV8dCt xDyLpEZyrcKVe0();
}
