.class public final Lep/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lep/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lep/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lep/l;

    invoke-direct {v0}, Lep/l;-><init>()V

    sput-object v0, Lep/l$a;->a:Lep/l;

    return-void
.end method
