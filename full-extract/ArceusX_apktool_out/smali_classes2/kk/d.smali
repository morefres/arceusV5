.class public Lkk/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkk/d$a;
    }
.end annotation


# static fields
.field public static a:Lkk/d$a;


# direct methods
.method public static a()Z
    .locals 1

    sget-object v0, Lkk/d;->a:Lkk/d$a;

    invoke-interface {v0}, Lkk/d$a;->b()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lkk/d;->a:Lkk/d$a;

    invoke-interface {v0}, Lkk/d$a;->a()Z

    move-result v0

    return v0
.end method

.method public static c(Lkk/d$a;)V
    .locals 0

    sput-object p0, Lkk/d;->a:Lkk/d$a;

    return-void
.end method
