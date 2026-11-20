.class public Lhi/h;
.super Lrk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhi/h$a;,
        Lhi/h$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Navigation"

    invoke-direct {p0, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lhi/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhi/h$a;-><init>(Lhi/h;Lhi/i;)V

    const-string v2, "navigateToFeature"

    invoke-virtual {p0, v2, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    new-instance v0, Lhi/h$b;

    invoke-direct {v0, p0, v1}, Lhi/h$b;-><init>(Lhi/h;Lhi/i;)V

    const-string v1, "openUserProfile"

    invoke-virtual {p0, v1, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    return-void
.end method
