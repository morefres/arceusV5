.class public final Lsm/x;
.super Lsm/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lsm/h<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final a:Lsm/h$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsm/x$a;

    invoke-direct {v0}, Lsm/x$a;-><init>()V

    sput-object v0, Lsm/x;->a:Lsm/h$e;

    return-void
.end method
