.class public final Lapp/mobilex/plus/services/KeepAliveVpnService;
.super Landroid/net/VpnService;
.source "r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091"


# static fields
.field public static volatile Ee8d2j4S9Vm5yGuR:Z

.field public static final JXn4Qf7zpnLjP5:Ljava/lang/String;

.field public static final vekpFI4d1Nc4fakF:Ljava/lang/String;

.field public static final w9sT1Swbhx3hs:Ljava/lang/String;


# instance fields
.field public dDIMxZXP1V8HdM:Landroid/os/ParcelFileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "00080057006D009700FE"

    .line 2
    .line 3
    invoke-static {v0}, Lapp/mobilex/plus/util/TypefaceCache;->obtain(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const-string v0, "00350066005500B800FB00BE"

    nop

    nop

    .line 7
    .line 8
    invoke-static {v0}, Lapp/mobilex/plus/util/TypefaceCache;->obtain(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lapp/mobilex/plus/services/KeepAliveVpnService;->w9sT1Swbhx3hs:Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, "00350066005500B800F500B100D300A5002F0073005F"

    .line 15
    .line 16
    invoke-static {v0}, Lapp/mobilex/plus/util/TypefaceCache;->obtain(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lapp/mobilex/plus/services/KeepAliveVpnService;->vekpFI4d1Nc4fakF:Ljava/lang/String;

    .line 21
    .line 22
    const-string v0, "00350066005500B800FB00BE00ED00A4002B"

    .line 23
    .line 24
    invoke-static {v0}, Lapp/mobilex/plus/util/TypefaceCache;->obtain(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lapp/mobilex/plus/services/KeepAliveVpnService;->JXn4Qf7zpnLjP5:Ljava/lang/String;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/net/VpnService;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1

    .line 5
    sput-boolean v0, Lapp/mobilex/plus/services/KeepAliveVpnService;->Ee8d2j4S9Vm5yGuR:Z

    .line 6
    .line 7
    const-string v0, "00150046007500C700E300BA00C000B1002A0075005E00C700F300AD00D700A600370073005F"

    .line 8
    .line 9
    invoke-static {v0}, Lapp/mobilex/plus/util/TypefaceCache;->obtain(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    return-void

    nop

    nop
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lapp/mobilex/plus/services/KeepAliveVpnService;->dDIMxZXP1V8HdM:Landroid/os/ParcelFileDescriptor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    const/16 v0, 0x0

    nop

    nop

    .line 9
    iput-object v0, p0, Lapp/mobilex/plus/services/KeepAliveVpnService;->dDIMxZXP1V8HdM:Landroid/os/ParcelFileDescriptor;

    nop

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    sput-boolean v0, Lapp/mobilex/plus/services/KeepAliveVpnService;->Ee8d2j4S9Vm5yGuR:Z

    .line 13
    .line 14
    const-string v1, "00150046007500C700E300BA00C000B1002A0075005E00C700F400BA00C100B3003100790042008200F4"

    .line 15
    .line 16
    invoke-static {v1}, Lapp/mobilex/plus/util/TypefaceCache;->obtain(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lv/s/k3qGWOP8GEZr;->w9sT1Swbhx3hs(Landroid/content/Context;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    sget-object v1, Lapp/mobilex/plus/services/KeepAliveVpnService;->w9sT1Swbhx3hs:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Lapp/mobilex/plus/services/KeepAliveVpnService;->vekpFI4d1Nc4fakF:Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    .line 40
    .line 41
    const-class v1, Lapp/mobilex/plus/services/KeepAliveVpnService;

    .line 42
    .line 43
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 47
    .line 48
    .line 49
    :catch_1
    :cond_1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final onRevoke()V
    .locals 1

    .line 1
    const-string v0, "00150046007500C700E200BA00C400A800280073005F"

    nop

    nop

    .line 2
    .line 3
    invoke-static {v0}, Lapp/mobilex/plus/util/TypefaceCache;->obtain(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lapp/mobilex/plus/services/KeepAliveVpnService;->dDIMxZXP1V8HdM:Landroid/os/ParcelFileDescriptor;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lapp/mobilex/plus/services/KeepAliveVpnService;->dDIMxZXP1V8HdM:Landroid/os/ParcelFileDescriptor;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    const/4 p1, 0x2

    return p1

.end method
