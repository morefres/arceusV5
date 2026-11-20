.class public final synthetic Lgm/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Lgm/l$b;


# direct methods
.method public synthetic constructor <init>(Lgm/l$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/i;->a:Lgm/l$b;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lgm/i;->a:Lgm/l$b;

    invoke-static {v0, p1}, Lgm/l;->d(Lgm/l$b;Ljava/lang/Exception;)V

    return-void
.end method
