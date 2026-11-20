.class public final Lgo/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgo/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lgo/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgo/l;

    invoke-direct {v0}, Lgo/l;-><init>()V

    sput-object v0, Lgo/l$a;->a:Lgo/l;

    return-void
.end method
