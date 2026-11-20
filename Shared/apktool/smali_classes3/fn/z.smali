.class public final synthetic Lfn/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfn/b0;


# direct methods
.method public synthetic constructor <init>(Lfn/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/z;->a:Lfn/b0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfn/z;->a:Lfn/b0;

    invoke-static {v0}, Lfn/b0;->b(Lfn/b0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
