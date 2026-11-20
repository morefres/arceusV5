.class public Lhi/l;
.super Lrk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhi/l$a;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String; = "hi.l"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "Push"

    invoke-direct {p0, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lhi/l$a;

    invoke-direct {v0, p0, p1}, Lhi/l$a;-><init>(Lhi/l;Landroid/content/Context;)V

    const-string p1, "pushPermissionTrigger"

    invoke-virtual {p0, p1, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    return-void
.end method

.method public static bridge synthetic e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lhi/l;->c:Ljava/lang/String;

    return-object v0
.end method
