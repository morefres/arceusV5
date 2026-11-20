.class public final Lxq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxq/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldt/d<",
        "Lxq/a$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lxq/b;
    .locals 1

    sget-object v0, Lxq/b$a;->a:Lxq/b;

    return-object v0
.end method

.method public static c()Lxq/a$a;
    .locals 1

    new-instance v0, Lxq/a$a;

    invoke-direct {v0}, Lxq/a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lxq/a$a;
    .locals 1

    invoke-static {}, Lxq/b;->c()Lxq/a$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lxq/b;->b()Lxq/a$a;

    move-result-object v0

    return-object v0
.end method
