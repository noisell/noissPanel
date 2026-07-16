package v.s;

import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class ZUdpmmMbwTAvDfmZEHcD {
    public final LinkedHashSet JXn4Qf7zpnLjP5;
    public boolean dDIMxZXP1V8HdM;
    public sFdNPiaH9eT4T vekpFI4d1Nc4fakF;
    public UUID w9sT1Swbhx3hs = UUID.randomUUID();

    public ZUdpmmMbwTAvDfmZEHcD(Class cls) {
        this.vekpFI4d1Nc4fakF = new sFdNPiaH9eT4T(this.w9sT1Swbhx3hs.toString(), 0, cls.getName(), (String) null, (MnLRqMow83uotly4qYT) null, (MnLRqMow83uotly4qYT) null, 0L, 0L, 0L, (RdWywP7AQUqPn0G) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(oRoeOWAwLibMBxZYyTh.DVTNwpDEVsUKuznof(1));
        linkedHashSet.add(strArr[0]);
        this.JXn4Qf7zpnLjP5 = linkedHashSet;
    }

    public final ZUdpmmMbwTAvDfmZEHcD Ee8d2j4S9Vm5yGuR(long j, TimeUnit timeUnit) {
        this.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.vekpFI4d1Nc4fakF.ibVTtJUNfrGYbW) {
            return vekpFI4d1Nc4fakF();
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    public final ZUdpmmMbwTAvDfmZEHcD JXn4Qf7zpnLjP5(int i, long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.dDIMxZXP1V8HdM = true;
        sFdNPiaH9eT4T sfdnpiah9et4t = this.vekpFI4d1Nc4fakF;
        sfdnpiah9et4t.gmNWMfvn6zlEj = i;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
        if (millis < 10000) {
            fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab().getClass();
        }
        sfdnpiah9et4t.gIIiyi2ddlMDR0 = OFtLBiBbrrTHWu.ibVTtJUNfrGYbW(millis, 10000L, 18000000L);
        return vekpFI4d1Nc4fakF();
    }

    public final GIUFlVOyGkYog dDIMxZXP1V8HdM() {
        GIUFlVOyGkYog gIUFlVOyGkYogW9sT1Swbhx3hs = w9sT1Swbhx3hs();
        RdWywP7AQUqPn0G rdWywP7AQUqPn0G = this.vekpFI4d1Nc4fakF.D5P1xCAyuvgF;
        boolean z = !rdWywP7AQUqPn0G.b1EoSIRjJHO5.isEmpty() || rdWywP7AQUqPn0G.JXn4Qf7zpnLjP5 || rdWywP7AQUqPn0G.w9sT1Swbhx3hs || rdWywP7AQUqPn0G.vekpFI4d1Nc4fakF;
        sFdNPiaH9eT4T sfdnpiah9et4t = this.vekpFI4d1Nc4fakF;
        if (sfdnpiah9et4t.J0zjQ7CAgohuxU20eCW6) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (sfdnpiah9et4t.ibVTtJUNfrGYbW > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        this.w9sT1Swbhx3hs = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        sFdNPiaH9eT4T sfdnpiah9et4t2 = this.vekpFI4d1Nc4fakF;
        this.vekpFI4d1Nc4fakF = new sFdNPiaH9eT4T(string, sfdnpiah9et4t2.w9sT1Swbhx3hs, sfdnpiah9et4t2.vekpFI4d1Nc4fakF, sfdnpiah9et4t2.JXn4Qf7zpnLjP5, new MnLRqMow83uotly4qYT(sfdnpiah9et4t2.Ee8d2j4S9Vm5yGuR), new MnLRqMow83uotly4qYT(sfdnpiah9et4t2.xDyLpEZyrcKVe0), sfdnpiah9et4t2.ibVTtJUNfrGYbW, sfdnpiah9et4t2.b1EoSIRjJHO5, sfdnpiah9et4t2.pyu8ovAipBTLYAiKab, new RdWywP7AQUqPn0G(sfdnpiah9et4t2.D5P1xCAyuvgF), sfdnpiah9et4t2.hjneShqpF9Tis4, sfdnpiah9et4t2.gmNWMfvn6zlEj, sfdnpiah9et4t2.gIIiyi2ddlMDR0, sfdnpiah9et4t2.wotphlvK9sPbXJ, sfdnpiah9et4t2.Qrz92kRPw4GcghAc, sfdnpiah9et4t2.nQilHWaqS401ZtR, sfdnpiah9et4t2.J0zjQ7CAgohuxU20eCW6, sfdnpiah9et4t2.MLSIo1htfMPWeB8V876L, sfdnpiah9et4t2.XiR1pIn5878vVWd, sfdnpiah9et4t2.DVTNwpDEVsUKuznof, sfdnpiah9et4t2.l1V0lQr6TbwNKqHfXNbb, sfdnpiah9et4t2.K7eEOBPYP9VIoHWTe, 524288);
        return gIUFlVOyGkYogW9sT1Swbhx3hs;
    }

    public abstract ZUdpmmMbwTAvDfmZEHcD vekpFI4d1Nc4fakF();

    public abstract GIUFlVOyGkYog w9sT1Swbhx3hs();
}
