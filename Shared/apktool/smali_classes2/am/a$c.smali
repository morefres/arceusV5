.class public Lam/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lam/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final a:Lam/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lam/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lam/a;-><init>(Lam/b;)V

    sput-object v0, Lam/a$c;->a:Lam/a;

    return-void
.end method

.method public static bridge synthetic a()Lam/a;
    .locals 1

    sget-object v0, Lam/a$c;->a:Lam/a;

    return-object v0
.end method
