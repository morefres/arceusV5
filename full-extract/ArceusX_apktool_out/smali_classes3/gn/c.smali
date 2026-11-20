.class public final synthetic Lgn/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lgn/f;


# direct methods
.method public synthetic constructor <init>(Lgn/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgn/c;->a:Lgn/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgn/c;->a:Lgn/f;

    check-cast p1, Landroid/media/MediaFormat;

    invoke-static {v0, p1}, Lgn/f;->a(Lgn/f;Landroid/media/MediaFormat;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
