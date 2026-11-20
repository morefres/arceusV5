.class public final enum Lmm/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmm/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lmm/n;

.field public static final enum b:Lmm/n;

.field public static final enum c:Lmm/n;

.field public static final enum d:Lmm/n;

.field public static final enum e:Lmm/n;

.field public static final enum f:Lmm/n;

.field public static final enum g:Lmm/n;

.field public static final enum h:Lmm/n;

.field public static final synthetic i:[Lmm/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmm/n;

    const-string v1, "CAMERA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmm/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/n;->a:Lmm/n;

    new-instance v0, Lmm/n;

    const-string v1, "CONTACT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lmm/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/n;->b:Lmm/n;

    new-instance v0, Lmm/n;

    const-string v1, "RECORD_AUDIO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lmm/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/n;->c:Lmm/n;

    new-instance v0, Lmm/n;

    const-string v1, "MODIFY_AUDIO_SETTINGS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lmm/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/n;->d:Lmm/n;

    new-instance v0, Lmm/n;

    const-string v1, "WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lmm/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/n;->e:Lmm/n;

    new-instance v0, Lmm/n;

    const-string v1, "READ_EXTERNAL_STORAGE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lmm/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/n;->f:Lmm/n;

    new-instance v0, Lmm/n;

    const-string v1, "POST_NOTIFICATIONS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lmm/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/n;->g:Lmm/n;

    new-instance v0, Lmm/n;

    const-string v1, "MEDIA_PICKER"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lmm/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmm/n;->h:Lmm/n;

    invoke-static {}, Lmm/n;->a()[Lmm/n;

    move-result-object v0

    sput-object v0, Lmm/n;->i:[Lmm/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Lmm/n;
    .locals 8

    sget-object v0, Lmm/n;->a:Lmm/n;

    sget-object v1, Lmm/n;->b:Lmm/n;

    sget-object v2, Lmm/n;->c:Lmm/n;

    sget-object v3, Lmm/n;->d:Lmm/n;

    sget-object v4, Lmm/n;->e:Lmm/n;

    sget-object v5, Lmm/n;->f:Lmm/n;

    sget-object v6, Lmm/n;->g:Lmm/n;

    sget-object v7, Lmm/n;->h:Lmm/n;

    filled-new-array/range {v0 .. v7}, [Lmm/n;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmm/n;
    .locals 1

    const-class v0, Lmm/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmm/n;

    return-object p0
.end method

.method public static values()[Lmm/n;
    .locals 1

    sget-object v0, Lmm/n;->i:[Lmm/n;

    invoke-virtual {v0}, [Lmm/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmm/n;

    return-object v0
.end method
