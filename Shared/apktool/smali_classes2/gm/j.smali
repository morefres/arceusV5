.class public final synthetic Lgm/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/g;


# instance fields
.field public final synthetic a:Lgm/l$b;


# direct methods
.method public synthetic constructor <init>(Lgm/l$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/j;->a:Lgm/l$b;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lgm/j;->a:Lgm/l$b;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Lgm/l;->c(Lgm/l$b;Ljava/lang/Void;)V

    return-void
.end method
