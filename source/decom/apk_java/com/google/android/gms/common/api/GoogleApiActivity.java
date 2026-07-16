package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import v.s.DBz5KzDJzqYVg1s;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.a4Aq5QBZFai3VwgjU;
import v.s.iFLJbvrqroccc6;
import v.s.nyZDwrpXoi7nqMd;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int w9sT1Swbhx3hs = 0;
    public int dDIMxZXP1V8HdM = 0;

    private static /* synthetic */ void ztclt() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ?? r1 = (-27) + 28;
        if (i == r1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", r1);
            this.dDIMxZXP1V8HdM = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                DBz5KzDJzqYVg1s dBz5KzDJzqYVg1sJXn4Qf7zpnLjP5 = DBz5KzDJzqYVg1s.JXn4Qf7zpnLjP5(this);
                if (i2 == -1) {
                    iFLJbvrqroccc6 ifljbvrqroccc6 = dBz5KzDJzqYVg1sJXn4Qf7zpnLjP5.gIIiyi2ddlMDR0;
                    ifljbvrqroccc6.sendMessage(ifljbvrqroccc6.obtainMessage(3));
                } else if (i2 == 0) {
                    dBz5KzDJzqYVg1sJXn4Qf7zpnLjP5.Ee8d2j4S9Vm5yGuR(new nyZDwrpXoi7nqMd(76 - 63, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.dDIMxZXP1V8HdM = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.dDIMxZXP1V8HdM = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.dDIMxZXP1V8HdM = bundle.getInt("resolution");
        }
        if (this.dDIMxZXP1V8HdM == 1) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
            return;
        }
        if (pendingIntent == null) {
            SbxdZ6Kq2uhHQ5RPRqm.ibVTtJUNfrGYbW(num);
            a4Aq5QBZFai3VwgjU.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF(this, num.intValue(), this);
            this.dDIMxZXP1V8HdM = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.dDIMxZXP1V8HdM = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    DBz5KzDJzqYVg1s.JXn4Qf7zpnLjP5(this).Ee8d2j4S9Vm5yGuR(new nyZDwrpXoi7nqMd(22, null), getIntent().getIntExtra("failing_client_id", (-50) + 49));
                } else {
                    String string = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(string);
                    sb.append(".");
                    String string2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        string2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                googleApiActivity.dDIMxZXP1V8HdM = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        } catch (ActivityNotFoundException unused3) {
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException unused4) {
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.dDIMxZXP1V8HdM);
        super.onSaveInstanceState(bundle);
    }
}
